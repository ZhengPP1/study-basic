package com.bingbing.kafka.interceptor;

import org.apache.kafka.clients.producer.ProducerInterceptor;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Map;

/**
 * 计数拦截器
 * 在消息发送后更新成功发送消息或发送失败的消息数
 * @author : bingbing
 */
public class CounterInterceptor implements ProducerInterceptor<String,String> {
    int success=0;
    int error=0;
    @Override
    public ProducerRecord<String, String> onSend(ProducerRecord<String, String> producerRecord) {
        return null;
    }

    @Override
    public void onAcknowledgement(RecordMetadata recordMetadata, Exception e) {
        if (recordMetadata!=null){
            success++;
        }else {
            error++;
        }

    }

    @Override
    public void close() {
        System.out.println("success：" + success);
        System.out.println("error：" + error);
    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}
