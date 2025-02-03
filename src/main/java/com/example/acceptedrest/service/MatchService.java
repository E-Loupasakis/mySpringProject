package com.example.acceptedrest.service;

import com.example.acceptedrest.dto.MatchDTO;
import com.example.acceptedrest.entities.Match;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {
    public List<MatchDTO> findByHomeTeam(String homeTeam);
    public void save(MatchDTO matchDto);
}
