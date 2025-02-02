package com.example.acceptedrest.service.impl;

import com.example.acceptedrest.entities.Match;
import com.example.acceptedrest.repository.MatchRepository;
import com.example.acceptedrest.service.MatchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {
    private final MatchRepository matchRepository;

    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<Match> findByHomeTeam(String homeTeam) {
        return matchRepository.findByHomeTeam(homeTeam);
    }

    @Override
    public void save(Match match) {
        matchRepository.save(match);
    }
}
