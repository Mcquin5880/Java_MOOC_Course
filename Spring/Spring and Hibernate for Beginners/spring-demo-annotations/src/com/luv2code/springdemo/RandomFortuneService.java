package com.luv2code.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"Random fortune 1!", "Random fortune 2!", "Random fortune 3!"};
	private Random random = new Random();

	@Override
	public String getFortune() {
		return fortunes[random.nextInt(3)];
	}

}
