package com.rstats.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rstats.restapi.model.Match;
import com.rstats.restapi.model.Player;
import com.rstats.restapi.service.MatchService;
import com.rstats.restapi.service.StatsService;

@RestController
@RequestMapping("/api/match")
public class MatchController {

    @Autowired
    private StatsService statsService;

    @Autowired
    private MatchService matchService;

    @PostMapping("/init")
    public ResponseEntity<Match> initMatch(@RequestBody Match match){
        Match newMatch = matchService.createMatch(match);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMatch);
    }

    @PostMapping("/finish")
    public ResponseEntity<Match> finishMatch(@RequestBody Match match){
        matchService.updateMatch(match.getId(), match);

        List<Player> home_players = match.getTeamHome();
        List<Player> opp_players = match.getTeamOpp();

        for (Player player : home_players) {
            
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(match);
    }
    
}
