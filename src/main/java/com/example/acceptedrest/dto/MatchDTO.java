package com.example.acceptedrest.dto;

import com.example.acceptedrest.enums.Sport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MatchDTO {

    private String description;
    private String homeTeam;
    private String awayTeam;
    private Sport sport;
    private String matchDate;
    private String matchTime;
}
