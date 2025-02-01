package com.example.acceptedrest;

import com.example.acceptedrest.entities.Match;
import com.example.acceptedrest.enums.Sport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AcceptedRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcceptedRestApplication.class, args);
        Match match1 = new Match("my test match", "Oly", "Pao", Sport.BASKETBALL);
        Match match2 = new Match("my test match", "Pao", "Oly", Sport.BASKETBALL);
        Match match3 = new Match("my test match", "Oly2", "Pao3", Sport.BASKETBALL);

    }

}
