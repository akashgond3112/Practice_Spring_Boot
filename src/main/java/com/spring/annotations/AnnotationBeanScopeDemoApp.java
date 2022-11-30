package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        // load spring file
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext_annotation_1.xml");

        // retrieve bean from spring container
        Coach betaCoach = classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = classPathXmlApplicationContext.getBean("tennisCoach", Coach.class);

        // check if both are same or not
        boolean result = (betaCoach == alphaCoach);
        System.out.println("\npointing to the same object : " + result);

        System.out.println("\nMemory location for beta coach : " + betaCoach);
        System.out.println("\nMemory location for alpha coach : " + alphaCoach);

        // close the bean
        classPathXmlApplicationContext.close();

    }

}
