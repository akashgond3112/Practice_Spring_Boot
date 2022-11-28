package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {
    public static void main(String[] args) {

        // load the spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "bean-lifecycle_applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getDailyWorkout());

        // close the context
        context.close();
    }
}
