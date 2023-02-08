package com.bingbing.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

/**
 * @author : bingbing
 */
public class MyConsumer {
    public static void main(String[] args) {
        String server = "192.168.50.97:9092";
        /* 1.创建消费者配置信息 */

        Properties properties = new Properties();
        /* 2.给配置信息赋值 */

        /* 连接的集群 */
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, server);

//        /* 开启自动提交 */
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
        /* 自动提交的延时 */
        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");

        /* 关闭自动提交 */
//        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);

        /* key,value的反序列化 */
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        /* 消费者组 */
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "bigData");
        //创建消费者
        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);
        //订阅主题
        consumer.subscribe(Collections.singletonList("demo"));

        while (true) {
            ConsumerRecords<String, String> consumerRecords = consumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, String> consumerRecord : consumerRecords) {
                System.out.println("分区" + consumerRecord.partition() + "偏移量:" + consumerRecord.offset());
                System.out.println("key:" + consumerRecord.key() + ",value:" + consumerRecord.value());

            }

        }


        /* 同步提交，当前线程会阻塞直到 offset 提交成功 */
//            consumer.commitSync();


        /* 异步提交 */
//            consumer.commitAsync((Map<TopicPartition, OffsetAndMetadata> offsets, Exception exception)-> {
//                if (exception != null) {
//                    System.err.println("Commit failed for" + offsets);
//                }
//            });


    }
}
