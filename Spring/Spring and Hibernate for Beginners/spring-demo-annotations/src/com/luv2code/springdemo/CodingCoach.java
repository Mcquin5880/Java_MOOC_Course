package com.luv2code.springdemo;

public class CodingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CodingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Today we're going to learn about the Spring framework!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
