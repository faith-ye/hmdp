package com.hmdp.rabbitMQ;

import com.hmdp.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @className: RabbitDemoConsumer
 * @description: TODO
 * @author: faith_ye
 * @date: 2023/8/7 10:53
 * @version: 1.0
 */
@Component
//使用queuesToDeclare属性，如果不存在则会创建队列
@RabbitListener(queuesToDeclare = @Queue(RabbitMQConfig.RABBITMQ_DEMO_TOPIC))
public class RabbitDemoConsumer {

    @RabbitHandler
    public void process(Map map){
        System.out.println("消费者从RabbitMQ服务端消费消息：" + map.toString());
    }
}
