package com.example.guessinggame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    @Autowired
    private Game game;
    private int guessCount = 10;

    @PostConstruct
    public void postConstructTest() {
        log.info("Testing postConstruct: " + game.getNumber());
    }

    @Override
    public String getMainMessage() {
        return "Testing: calling getMainMessage()";
    }

    @Override
    public String getResultMessage() {
        return "Testing: calling getResultMessage()";
    }
}
