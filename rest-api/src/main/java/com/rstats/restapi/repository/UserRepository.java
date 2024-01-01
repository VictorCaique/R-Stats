package com.rstats.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.rstats.restapi.model.User;;

public interface UserRepository extends CrudRepository<User, Long>{

}
