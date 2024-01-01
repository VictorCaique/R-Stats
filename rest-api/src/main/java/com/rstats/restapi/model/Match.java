package com.rstats.restapi.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "MATCH")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    private String date;

    @ManyToMany
    @JoinTable(
        name = "team_home",
        joinColumns = @JoinColumn(name = "player_id"),
        inverseJoinColumns = @JoinColumn(name = "match_id")
    )
    List<Player> teamHome;

    @ManyToMany
    @JoinTable(
        name = "team_opp",
        joinColumns = @JoinColumn(name = "player_id"),
        inverseJoinColumns = @JoinColumn(name = "match_id")
    )
    List<Player> teamOpp;

    @Column(name = "score_home")
    private int scoreHome;

    @Column(name = "score_opp")
    private int score_opp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Player> getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(List<Player> teamHome) {
        this.teamHome = teamHome;
    }

    public List<Player> getTeamOpp() {
        return teamOpp;
    }

    public void setTeamOpp(List<Player> teamOpp) {
        this.teamOpp = teamOpp;
    }

    public int getScoreHome() {
        return scoreHome;
    }

    public void setScoreHome(int scoreHome) {
        this.scoreHome = scoreHome;
    }

    public int getScore_opp() {
        return score_opp;
    }

    public void setScore_opp(int score_opp) {
        this.score_opp = score_opp;
    }

    
}

