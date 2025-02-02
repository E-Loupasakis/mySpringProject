package com.example.acceptedrest.repository;

import com.example.acceptedrest.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {
    public List<Match> findByHomeTeam(String homeTeam);
}
