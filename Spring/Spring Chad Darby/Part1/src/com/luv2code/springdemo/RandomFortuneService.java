package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"This is fortune number one!", 
			"This is fortune number two!", 
			"This is fortune number three!"
		};

	private Random random = new Random();

	@Override
	public String getDailyFortune() {
		return "Standard daily fortune!";
	}
	
	public String getFortune() {		
		return fortunes[random.nextInt(fortunes.length)];
	}

}
