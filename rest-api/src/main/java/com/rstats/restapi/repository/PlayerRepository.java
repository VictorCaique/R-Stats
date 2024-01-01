package com.rstats.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.rstats.restapi.model.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {

}
