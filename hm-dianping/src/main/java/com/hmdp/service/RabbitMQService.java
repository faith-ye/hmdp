package com.hmdp.service;

public interface RabbitMQService {
    String sendMsg(String msg) throws Exception;
    String sendMsgByFanoutExchange(String msg) throws Exception;
}
