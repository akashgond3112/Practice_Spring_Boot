package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring file

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext_annotation_1.xml");

        // get the bean from spring container
        // Coach coach = classPathXmlApplicationContext.getBean("thatSillyCoach",Coach.class);

        /*
         * bean name should start with
         * small case of class name
         * when component is set to
         * default
         */
        Coach coach = classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);

        // call a method from the bean
        System.out.println(coach.getDailyWorkout());

        // call new method
        System.out.println(coach.getDailyFortune());

        // close the bean
        classPathXmlApplicationContext.close();
    }

}
