package com.spring.demo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFrotune() {
        return "Today is ur luck day!";
    }

}
