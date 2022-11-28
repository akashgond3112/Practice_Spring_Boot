package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {

        // load the spring configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "bean-scope_applicationContext.xml");

        // retrieve bean from spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // compare if both the above objects are equal or not
        boolean result = (coach == alphaCoach);

        System.out.println("\npointing to same object : " + result);

        System.out.println("\nmemory location for the coach : " + coach);
        System.out.println("\nmemory location for the alpha coach : " + alphaCoach);

        // call methods on the bean

        // close the context
        context.close();
    }
}
