package com.spring.demo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	// define a constructor
	public TrackCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	public TrackCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just dot it~ " + fortuneService.getFrotune();
	}
	
	// add init method
	public void doMyStartupStuff() {
		System.out.println("Track coach: inside startup method!");
	}

	// add destroy method
	public void doMyFinishtuff() {
		System.out.println("Track coach: inside finish method!");
	}

}










