package com.hmdp.rabbitMQ;

import com.hmdp.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @className: FanoutExchangeConsumerA
 * @description: TODO
 * @author: faith_ye
 * @date: 2023/8/8 10:25
 * @version: 1.0
 */
@Component
@RabbitListener(queuesToDeclare = @Queue(RabbitMQConfig.FANOUT_EXCHANGE_QUEUE_TOPIC_A))
public class FanoutExchangeConsumerA {
    @RabbitHandler
    public void process(Map<String, Object> map){
        System.out.println("队列A收到消息：" + map.toString());
    }
}
