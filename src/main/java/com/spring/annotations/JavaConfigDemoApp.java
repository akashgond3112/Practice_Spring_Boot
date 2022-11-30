package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext classPathXmlApplicationContext = new AnnotationConfigApplicationContext(SportConfig.class);


        // get the bean from spring container
        Coach coach = classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);

        // call a method from the bean
        System.out.println(coach.getDailyWorkout());

        // call new method
        System.out.println(coach.getDailyFortune());

        // close the bean
        classPathXmlApplicationContext.close();
    }

}
