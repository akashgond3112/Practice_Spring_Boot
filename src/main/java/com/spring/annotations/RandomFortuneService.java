package com.spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

    // create array of strings
    private String[] data = {
            "Bewae of the wolf",
            "Diligence is the mother of good luck!",
            "the journey s the reward!",
    };

    private Random random = new Random();

    @Override
    public String getFortune() {

        int index = random.nextInt(data.length);
        return data[index];
    }

}
