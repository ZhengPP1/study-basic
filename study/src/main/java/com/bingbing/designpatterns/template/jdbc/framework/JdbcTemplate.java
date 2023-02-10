package com.bingbing.designpatterns.template.jdbc.framework;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author : bingbing
 */
public abstract class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public final List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {

        try {
            // 1获取链接
            Connection connection = this.getConnection();
            // 2创建语句集
            PreparedStatement prepareStatement = this.createPrepareStatement(connection, sql);
            // 3执行语句集
            ResultSet resultSet = this.executeQuery(prepareStatement, values);

            // 4处理结果集
            this.parseResultSet(resultSet,rowMapper);
            // 5关闭结果集
            resultSet.close();
            // 6关闭语句集
            prepareStatement.close();
            // 7关闭链接
            connection.close();



        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    private ResultSet executeQuery(PreparedStatement prepareStatement, Object[] values) throws SQLException {

        for (int i = 0; i < values.length; i++) {
            prepareStatement.setObject(i,values[i]);
        }

        return prepareStatement.executeQuery();
    }

    private List<?> parseResultSet(ResultSet rs,RowMapper<?> rowMapper) throws Exception{

        List<Object> result=new ArrayList<>();
        int rowNum=0;

        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }

        return result;
    }


    private PreparedStatement createPrepareStatement(Connection conn,String sql) throws SQLException{

        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
