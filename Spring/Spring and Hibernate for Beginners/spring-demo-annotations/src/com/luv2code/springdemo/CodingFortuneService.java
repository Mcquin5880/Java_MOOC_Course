package com.luv2code.springdemo;

public class CodingFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today we're not going to encounter any bugs whatsoever.";
	}

}
