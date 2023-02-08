package com.bingbing.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * 带回调函数
 * @author : bingbing
 */
public class CallBackProducer {
    public static void main(String[] args) {
        String server = "192.168.50.97:9092";
        // 1.创建配置信息
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, server);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        // 2.创建生产者对象
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
        producer.send(new ProducerRecord<>("test1","bingbing","带回调方法的生产者发出的信息"),((recordMetadata, e) -> {
            if (e==null){
                System.out.println("元数据分区"+recordMetadata.partition()+",偏移量"+recordMetadata.offset());
            }else {
                e.printStackTrace();
            }
        }));
        producer.close();
    }
}
