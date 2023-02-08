package com.bingbing.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;

import java.util.*;


/**
 * 自定义存储offset
 *
 * @author : bingbing
 */
public class CustomerConsumer {
    private static Map<TopicPartition,Long> currentOffset=new HashMap<>();
    public static void main(String[] args) {
        String server = "192.168.50.97:9092";
        //创建配置信息
        Properties properties = new Properties();
        //Kafka 集群
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,server);
        //消费者组，只要 group.id 相同，就属于同一个消费者组
        properties.put(ConsumerConfig.GROUP_ID_CONFIG,"bigData");
        //关闭自动提交 offset
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG,false);
        //Key 和 Value 的反序列化类
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer");
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,"org.apache.kafka.common.serialization.StringDeserializer");

        //创建一个消费者
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
        consumer.subscribe(Collections.singletonList("demo"), new ConsumerRebalanceListener() {
            //该方法在rebalance之前调用
            @Override
            public void onPartitionsRevoked(Collection<TopicPartition> collection) {
                commitOffset(currentOffset);

            }

            @Override
            public void onPartitionsAssigned(Collection<TopicPartition> collection) {
                currentOffset.clear();
                for (TopicPartition partition:collection){
                    //定位到最近提交的offset继续消费
                    consumer.seek(partition,getOffset(partition));
                }
            }
        });
    }
    //获得某分区最新的offset
    private static long getOffset(TopicPartition partition){
        return 0;
    }
    //提交该消费者所有分区的offset
    public static void commitOffset(Map<TopicPartition,Long> currentOffset){

    }



}
