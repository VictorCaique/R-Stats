package com.rstats.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.rstats.restapi.model.PlayerMatchStats;

public interface PlayerMatchStatsRepository extends CrudRepository<PlayerMatchStats, Long> {

}
