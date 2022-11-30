package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigjavaDemo {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext classPathXmlApplicationContext = new AnnotationConfigApplicationContext(SportConfig.class);


        // get the bean from spring container
        // Coach coach = classPathXmlApplicationContext.getBean("swimCoach", Coach.class);
        SwimCoach coach = classPathXmlApplicationContext.getBean("swimCoach", SwimCoach.class);

        // call a method from the bean
        System.out.println(coach.getDailyWorkout());

        // call new method
        System.out.println(coach.getDailyFortune());

        // call our new swin coach mehtods
        System.out.println("Email Id is : "+ coach.getEmail());
        System.out.println("Team Name is : "+ coach.getTeam());
        ;

        // close the bean
        classPathXmlApplicationContext.close();
    }

}
