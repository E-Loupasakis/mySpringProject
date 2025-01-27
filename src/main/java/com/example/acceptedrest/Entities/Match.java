package com.example.acceptedrest.Entities;

import com.example.acceptedrest.Enum.Sport;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Match {
    private static Integer incrementor= 0;

    private String description;
    private String teamA;
    private String teamB;
    private Sport sports;
    private LocalDate matchDate;
    private LocalTime matchTime;

    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");


}
