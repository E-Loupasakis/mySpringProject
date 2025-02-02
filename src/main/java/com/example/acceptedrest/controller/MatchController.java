package com.example.acceptedrest.controller;

import com.example.acceptedrest.entities.Match;
import com.example.acceptedrest.service.MatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/byHome/{homeTeam}")
    public List<Match> findByHomeTeam(@PathVariable String homeTeam) {
        return matchService.findByHomeTeam(homeTeam);
    }

    @GetMapping("/save/{match}")
}
