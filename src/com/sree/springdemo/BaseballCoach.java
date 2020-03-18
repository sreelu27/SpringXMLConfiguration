package com.sree.springdemo;

public class BaseballCoach implements Coach{
	

	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
		
	}
	@Override
	public String getDailyworkout() {
		
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
