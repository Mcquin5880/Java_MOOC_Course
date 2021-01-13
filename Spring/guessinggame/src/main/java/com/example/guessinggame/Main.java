package com.example.guessinggame;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess The Number Game.");

        // create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // get number gen bean from context (container)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        // log generated number
        log.info("number = {}", number);

        // get game bean from context (container), note param difference compared to above
        Game game = context.getBean(Game.class);

        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        log.info("---------- TESTING MSG GEN ----------");
        log.info(messageGenerator.getMainMessage());
        log.info(messageGenerator.getResultMessage());
        log.info("---------- TESTING MSG GEN ----------");

        // close context
        context.close();
    }
}
