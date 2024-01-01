package com.rstats.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.rstats.restapi.model.People;

public interface PeopleRepository extends CrudRepository<People, Long> {

}
