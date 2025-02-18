package com.example.acceptedrest.entities;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "matchOdds")
@NoArgsConstructor
public class MatchOdd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = false)
    private Match match;

    @Column(nullable = false)
    private String specifier;

    @Column(nullable = false)
    private Double odd;
}
