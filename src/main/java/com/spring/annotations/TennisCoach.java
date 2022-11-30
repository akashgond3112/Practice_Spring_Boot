package com.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component("thatSillyCoach")
@Component
// @Scope("prototype")
public class TennisCoach implements Coach {

    /*
     * Inorder to avoid the below exception we need to use the @Qualifire tag to
     * make happyFortuneService unique.
     * No qualifying bean of type
     * 'com.spring.annotations.FortuneService' available: expected single matching
     * bean but found 4:
     * databaseFortuneService,happyFortuneService,RESTFortuneService,
     * randomFortuneService
     */
    @Autowired
    // @Qualifier("happyFortuneService")
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;


    // define init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println(">> Tennis Coach : inside of doMyStartUpStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanUpUpStuff() {
        System.out.println(">> Tennis Coach : inside of doMyCleanUpUpStuff()");
    }

    /*
     * // Autowiring of constructor
     * 
     * @Autowired
     * TennisCoach(FortuneService theFortuneService) {
     * fortuneService = theFortuneService;
     * }
     */

    /*
     * // define setter method
     * 
     * @Autowired
     * public void setFortuneService(FortuneService fortuneService) {
     * System.out.println(">> inside setFortuneService() method!");
     * 
     * this.fortuneService = fortuneService;
     * }
     */

    @Autowired
    // @Qualifier("happyFortuneService")
    @Qualifier("randomFortuneService")
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(">> inside doSomeCrazyStuff() method!");

        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice ur back hand volley";
    }

    public TennisCoach() {
        System.out.println(">> inside default constructor!");
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
