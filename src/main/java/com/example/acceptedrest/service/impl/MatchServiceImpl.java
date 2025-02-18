package com.example.acceptedrest.service.impl;

import com.example.acceptedrest.dto.MatchDTO;
import com.example.acceptedrest.entities.Match;
import com.example.acceptedrest.entities.MatchOdd;
import com.example.acceptedrest.repository.MatchRepository;
import com.example.acceptedrest.service.MatchService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {
    private final MatchRepository matchRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MatchServiceImpl(MatchRepository matchRepository, ModelMapper modelMapper) {
        this.matchRepository = matchRepository;
        this.modelMapper = modelMapper;
    }

    public List<MatchDTO> findByHomeTeam(String homeTeam) {
        List<Match> matchList = matchRepository.findByHomeTeam(homeTeam);
        return matchList.stream()
                .map(match -> modelMapper.map(match, MatchDTO.class))
                .toList();
    }

    @Override
    public void save(MatchDTO matchDto) {
        Match match = modelMapper.map(matchDto, Match.class);
        List<MatchOdd> matchOdds = matchDto.getMatchOddsDTO()
                        .stream()
                        .map(odt -> {
                            MatchOdd matchOdd = new MatchOdd();
                            matchOdd.setSpecifier(odt.getSpecifier());
                            matchOdd.setOdd(odt.getOdd());
                            matchOdd.setMatch(match);
                            return matchOdd;
                        })
                        .toList();
        match.setMatchOdds(matchOdds);
        matchRepository.save(match);
    }
}
