package com.example.acceptedrest.service.impl;

import com.example.acceptedrest.dto.MatchDTO;
import com.example.acceptedrest.entities.Match;
import com.example.acceptedrest.repository.MatchRepository;
import com.example.acceptedrest.service.MatchService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        //WIP add code to ignore case for enum
        Match match = modelMapper.map(matchDto, Match.class);
        matchRepository.save(match);
    }
}
