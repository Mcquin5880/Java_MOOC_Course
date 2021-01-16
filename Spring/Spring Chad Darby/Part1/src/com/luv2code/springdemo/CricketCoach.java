package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	private FortuneService fortuneService;
	private RandomFortuneService randomFortuneService;
	
	public CricketCoach() {
		// no-arg constructor
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	public String getRandomFortune() {
		return randomFortuneService.getFortune();
	}

}
