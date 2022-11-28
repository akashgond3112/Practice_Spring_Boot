package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container

        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on the bean

        System.out.println(cricketCoach.getDailyWorkout());

        // call our new method
        System.out.println(cricketCoach.getDailyFortune());

        System.out.println(cricketCoach.getEmailAdress());
        System.out.println(cricketCoach.getTeam());

        // close the context
        context.close();

    }

}
