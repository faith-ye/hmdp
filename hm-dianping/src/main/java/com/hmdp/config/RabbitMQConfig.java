package com.hmdp.config;

/**
 * @className: RabbitMQConfig
 * @description: TODO
 * @author: faith_ye
 * @date: 2023/8/7 10:39
 * @version: 1.0
 */

public class RabbitMQConfig {
    /**
     * 交换机名称
     */
    public static final String RABBITMQ_DEMO_DIRECT_EXCHANGE = "rabbitmq_demo_direct_exchange";
    /**
     * 队列名称
     */
    public static final String RABBITMQ_DEMO_TOPIC = "rabbitmq_demo_topic";
    /**
     * 路由键
     */
    public static final String RABBITMQ_DEMO_DIRECT_ROUTING = "rabbitmq_demo_direct_routing";

    /**
     * RabbitMQ的FANOUT_EXCHANG交换机类型的队列 A 的名称
     */
    public static final String FANOUT_EXCHANGE_QUEUE_TOPIC_A = "fanout.A";

    /**
     * RabbitMQ的FANOUT_EXCHANG交换机类型的队列 B 的名称
     */
    public static final String FANOUT_EXCHANGE_QUEUE_TOPIC_B = "fanout.B";

    /**
     * RabbitMQ的FANOUT_EXCHANG交换机类型的名称
     */
    public static final String FANOUT_EXCHANGE_DEMO_NAME = "fanout.exchange.demo.name";
}
