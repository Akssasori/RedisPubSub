package com.broker.redis.subscriber;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

@Log4j2
public class Receiver implements MessageListener {

    @Override
    public void onMessage(Message message, byte[] pattern) {
        log.info("Consumed event {}", message);

    }
}
