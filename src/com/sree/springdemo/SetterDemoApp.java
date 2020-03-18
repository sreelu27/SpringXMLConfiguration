package com.sree.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
		Coach theCoach = context.getBean("myCricketCoach",Coach.class);
		
		System.out.println(theCoach.getDailyworkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
