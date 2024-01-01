package com.rstats.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STATS")
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "points")
    private int points;

    @Column(name = "field_goals_made")
    private int fieldGoalsMade;

    @Column(name = "field_goals_attempt")
    private int fieldGoalsAttempt;

    @Column(name = "field_goals_percent")
    private float fieldGoalsPercent;

    @Column(name = "tree_points_made")
    private int treePointsMade;

    @Column(name = "tree_points_attempt")
    private int treePointsAttempt;

    @Column(name = "tree_points_percent")
    private float treePointsPercent;

    @Column(name = "free_throws_made")
    private int freeThrowsMade;
    
    @Column(name = "free_throws_attempt")
    private int freeThrowsAttempt;
    
    @Column(name = "free_throws_percent")
    private int freeThrowsPercent;

    @Column(name = "defensive_rebounds")
    private int defensiveRebounds;
    
    @Column(name = "ofensive_rebounds")
    private int ofensiveRebounds;

    @Column(name = "rebounds")
    private int rebounds;

    @Column(name = "blocks")
    private int blocks;

    @Column(name = "steals")
    private int steals;

    @Column(name = "assists")
    private int assists;

    @Column(name = "turnovers")
    private int turnovers;

    
    
    // ---------------------------------------------------------------- CONSTRUCTORS
    public Stats() {
    }

    public Stats(int id){
        this.id = (long) id;
    }

    public Stats(long id){
        this.id = id;
    }


    // ---------------------------------------------------------------- GETTER/SETTER
    public int getFieldGoalsMade() {
        return fieldGoalsMade;
    }
    public void setFieldGoalsMade(int fieldGoalsMade) {
        this.fieldGoalsMade = fieldGoalsMade;
    }
    public int getFieldGoalsAttempt() {
        return fieldGoalsAttempt;
    }
    public void setFieldGoalsAttempt(int fieldGoalsAttempt) {
        this.fieldGoalsAttempt = fieldGoalsAttempt;
    }
    public float getFieldGoalsPercent() {
        return fieldGoalsPercent;
    }
    public void setFieldGoalsPercent(float fieldGoalsPercent) {
        this.fieldGoalsPercent = fieldGoalsPercent;
    }
    public int getTreePointsMade() {
        return treePointsMade;
    }
    public void setTreePointsMade(int treePointsMade) {
        this.treePointsMade = treePointsMade;
    }
    public int getTreePointsAttempt() {
        return treePointsAttempt;
    }
    public void setTreePointsAttempt(int treePointsAttempt) {
        this.treePointsAttempt = treePointsAttempt;
    }
    public float getTreePointsPercent() {
        return treePointsPercent;
    }
    public void setTreePointsPercent(float treePointsPercent) {
        this.treePointsPercent = treePointsPercent;
    }
    public int getFreeThrowsMade() {
        return freeThrowsMade;
    }
    public void setFreeThrowsMade(int freeThrowsMade) {
        this.freeThrowsMade = freeThrowsMade;
    }
    public int getFreeThrowsAttempt() {
        return freeThrowsAttempt;
    }
    public void setFreeThrowsAttempt(int freeThrowsAttempt) {
        this.freeThrowsAttempt = freeThrowsAttempt;
    }
    public int getFreeThrowsPercent() {
        return freeThrowsPercent;
    }
    public void setFreeThrowsPercent(int freeThrowsPercent) {
        this.freeThrowsPercent = freeThrowsPercent;
    }
    public int getDefensiveRebounds() {
        return defensiveRebounds;
    }
    public void setDefensiveRebounds(int defensiveRebounds) {
        this.defensiveRebounds = defensiveRebounds;
    }
    public int getOfensiveRebounds() {
        return ofensiveRebounds;
    }
    public void setOfensiveRebounds(int ofensiveRebounds) {
        this.ofensiveRebounds = ofensiveRebounds;
    }
    public int getTurnovers() {
        return turnovers;
    }
    public void setTurnovers(int turnovers) {
        this.turnovers = turnovers;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getRebounds() {
        return rebounds;
    }
    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }
    public int getBlocks() {
        return blocks;
    }
    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }
    public int getSteals() {
        return steals;
    }
    public void setSteals(int steals) {
        this.steals = steals;
    }
    public int getAssists() {
        return assists;
    }
    public void setAssists(int assists) {
        this.assists = assists;
    }



    
}

