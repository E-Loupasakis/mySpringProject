package com.example.acceptedrest.service;

import com.example.acceptedrest.entities.Match;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {
    public List<Match> findByHomeTeam(String homeTeam);
    public void save(Match match);
}
