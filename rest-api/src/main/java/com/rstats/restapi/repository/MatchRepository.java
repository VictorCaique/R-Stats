package com.rstats.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.rstats.restapi.model.Match;

public interface MatchRepository extends CrudRepository<Match, Long>{

}
