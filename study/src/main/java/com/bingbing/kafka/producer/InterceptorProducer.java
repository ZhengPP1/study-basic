package com.bingbing.kafka.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.ArrayList;
import java.util.Properties;

/**
 * @author : bingbing
 */
public class InterceptorProducer {
    public static void main(String[] args) {
        String server = "192.168.50.97:9092";
        // 1.创建配置信息
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, server);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");

        // 添加拦截器
        ArrayList<String> interceptors = new ArrayList<>();
        interceptors.add("com.bingbing.kafka.interceptor.TimeInterceptor");
        interceptors.add("com.bingbing.kafka.interceptor.CounterInterceptor");
        properties.put(ProducerConfig.INTERCEPTOR_CLASSES_CONFIG, interceptors);

        // 2.创建生产者对象
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        // 3.发送数据
        for (int i = 0; i < 5; i++) {
            producer.send(new ProducerRecord<>("test1", "测试" + i, "这是带拦截器的生产者发送的消息!" + i));
        }

        // 4.关闭资源
        producer.close();
    }
}

