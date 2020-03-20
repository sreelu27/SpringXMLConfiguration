package com.sree.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyworkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do it: "+fortuneService.getFortune();
	}
	
	//init method
	
	public void doMyStartupStuff() {
		System.out.println("TRack Coach inside the do my strat up stuff method");
	}
	
	//destroy method

	public void doMyCleanupStuff() {
		System.out.println("TRack Coach inside the do my clean up stuff method");
	}
}
