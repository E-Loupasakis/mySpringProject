package com.example.acceptedrest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MatchDTO {
    private String description;
    private String homeTeam;
    private String awayTeam;
    private String sport;
    private String matchDate;
    private String matchTime;

    @JsonProperty("matchOddsDTO")
    private List<MatchOddDTO> matchOddsDTO = new ArrayList<>();
}
