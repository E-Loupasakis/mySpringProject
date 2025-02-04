package com.example.acceptedrest.entities;

import com.example.acceptedrest.enums.Sport;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String homeTeam;

    @Column(nullable = false)
    private String awayTeam;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Sport sport;

    @Column(nullable = false)
    private LocalDate matchDate;

    @Column(nullable = false)
    private LocalTime matchTime;

    public Match(String description, String homeTeam, String awayTeam, Sport sport, LocalDate matchDate, LocalTime matchTime) {
        this.description = description;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.sport = sport;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
    }

    public Match() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public LocalTime getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(LocalTime matchTime) {
        this.matchTime = matchTime;
    }
}
