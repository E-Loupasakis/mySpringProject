package com.example.acceptedrest.controller;

import com.example.acceptedrest.dto.MatchDTO;
import com.example.acceptedrest.service.MatchService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchController {
    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/byHome/{homeTeam}")
    public ResponseEntity<List<MatchDTO>> findByHomeTeam(@PathVariable String homeTeam) {
        return ResponseEntity.ok(matchService.findByHomeTeam(homeTeam));
    }

    @PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveMatch(@RequestBody MatchDTO matchDto) {
        System.out.println("Received MatchDTO:"+ matchDto.toString());
        System.out.println("MatchOdds in DTO: "+ matchDto.getMatchOddsDTO());
        matchService.save(matchDto);
        return ResponseEntity.ok("Match created successfully");
    }

    //add multiple input at once
}
