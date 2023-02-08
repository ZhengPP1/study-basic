package com.bingbing.kafka.interceptor;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Map;

/**
 * 时间拦截器
 * 在消息发送前将时间戳信息加到消息value的最前
 * @author : bingbing
 */
public class TimeInterceptor implements ProducerInterceptor {

    @Override
    public ProducerRecord onSend(ProducerRecord producerRecord) {
        //1.取出数据
        String value = (String) producerRecord.value();
        //2.创建一个新的ProducerRecord对象，并返回
        return new ProducerRecord<>(producerRecord.topic(),producerRecord.partition(),producerRecord.key(),
                System.currentTimeMillis()+","+value);

    }

    @Override
    public void onAcknowledgement(RecordMetadata recordMetadata, Exception e) {

    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}
