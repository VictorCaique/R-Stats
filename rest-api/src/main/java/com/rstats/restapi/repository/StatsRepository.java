package com.rstats.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.rstats.restapi.model.Stats;

public interface StatsRepository extends CrudRepository<Stats, Long>{
    
}
