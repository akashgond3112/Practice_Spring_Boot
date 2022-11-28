package com.spring.demo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAdress;

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        System.out.println("Inside setter method : setEmailAdress");

        this.emailAdress = emailAdress;
    }

    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside setter method : setTeam");

        this.team = team;
    }

    public CricketCoach() {
        System.out.println("Inside no arg constructor : CrickteCoach");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFrotune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter method : setFortuneService");
        this.fortuneService = fortuneService;
    }

}
