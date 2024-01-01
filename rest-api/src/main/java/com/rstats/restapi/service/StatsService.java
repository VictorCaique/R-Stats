package com.rstats.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rstats.restapi.model.Stats;
import com.rstats.restapi.repository.StatsRepository;

import java.util.List;

@Service
public class StatsService {

    @Autowired
    private StatsRepository statsRepository;

    public Stats getStatsById(Long id) {
        return statsRepository.findById(id).orElse(null);
    }

    public List<Stats> getAllStats() {
        return (List<Stats>) statsRepository.findAll();
    }

    public Stats createStats(Stats stats) {
        return statsRepository.save(stats);
    }

    public Stats updateStats(Long id, Stats updatedStats) {
        Stats existingStats = statsRepository.findById(id).orElse(null);
        if (existingStats != null) {
            // TO implementate
            return statsRepository.save(existingStats);
        } else {
            return null;
        }
    }

    public boolean deleteStats(Long id) {
        if (statsRepository.existsById(id)) {
            statsRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
