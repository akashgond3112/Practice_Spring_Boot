package com.spring.demo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	// define a constructor
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFrotune();
	}

}
