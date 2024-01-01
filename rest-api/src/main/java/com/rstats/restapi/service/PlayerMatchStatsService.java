package com.rstats.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rstats.restapi.model.PlayerMatchStats;
import com.rstats.restapi.repository.PlayerMatchStatsRepository;

import java.util.List;

@Service
public class PlayerMatchStatsService {

    @Autowired
    private PlayerMatchStatsRepository playerMatchStatsRepository;

    public PlayerMatchStats getPlayerMatchStatsById(Long id) {
        return playerMatchStatsRepository.findById(id).orElse(null);
    }

    public List<PlayerMatchStats> getAllPlayerMatchStats() {
        return (List<PlayerMatchStats>) playerMatchStatsRepository.findAll();
    }

    public PlayerMatchStats createPlayerMatchStats(PlayerMatchStats playerMatchStats) {
        return playerMatchStatsRepository.save(playerMatchStats);
    }

    public PlayerMatchStats updatePlayerMatchStats(Long id, PlayerMatchStats updatedPlayerMatchStats) {
        PlayerMatchStats existingPlayerMatchStats = playerMatchStatsRepository.findById(id).orElse(null);
        if (existingPlayerMatchStats != null) {
            // TO implementate
            return playerMatchStatsRepository.save(existingPlayerMatchStats);
        } else {
            return null;
        }
    }

    public boolean deletePlayerMatchStats(Long id) {
        if (playerMatchStatsRepository.existsById(id)) {
            playerMatchStatsRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
