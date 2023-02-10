package com.bingbing.designpatterns.template.jdbc.framework;

import java.sql.ResultSet;

/**
 * orm映射定制化的接口
 * @author : bingbing
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
