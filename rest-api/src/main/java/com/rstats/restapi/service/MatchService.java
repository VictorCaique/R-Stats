package com.rstats.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rstats.restapi.model.Match;
import com.rstats.restapi.repository.MatchRepository;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public Match getMatchById(Long id) {
        return matchRepository.findById(id).orElse(null);
    }

    public List<Match> getAllMatch() {
        return (List<Match>) matchRepository.findAll();
    }

    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    public Match updateMatch(Long id, Match updatedMatch) {
        Match existingMatch = matchRepository.findById(id).orElse(null);
        if (existingMatch != null) {
            // TO implementate
            return matchRepository.save(existingMatch);
        } else {
            return null;
        }
    }

    public boolean deleteMatch(Long id) {
        if (matchRepository.existsById(id)) {
            matchRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
