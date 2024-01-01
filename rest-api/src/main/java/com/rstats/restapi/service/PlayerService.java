package com.rstats.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rstats.restapi.model.Player;
import com.rstats.restapi.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    public List<Player> getAllPlayer() {
        return (List<Player>) playerRepository.findAll();
    }

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Long id, Player updatedPlayer) {
        Player existingPlayer = playerRepository.findById(id).orElse(null);
        if (existingPlayer != null) {
            // TO implementate
            return playerRepository.save(existingPlayer);
        } else {
            return null;
        }
    }

    public boolean deletePlayer(Long id) {
        if (playerRepository.existsById(id)) {
            playerRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
