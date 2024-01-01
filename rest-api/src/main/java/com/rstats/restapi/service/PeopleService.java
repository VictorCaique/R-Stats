package com.rstats.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rstats.restapi.model.People;
import com.rstats.restapi.repository.PeopleRepository;

import java.util.List;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    public People getPeopleById(Long id) {
        return peopleRepository.findById(id).orElse(null);
    }

    public List<People> getAllPeople() {
        return (List<People>) peopleRepository.findAll();
    }

    public People createPeople(People people) {
        return peopleRepository.save(people);
    }

    public People updatePeople(Long id, People updatedPeople) {
        People existingPeople = peopleRepository.findById(id).orElse(null);
        if (existingPeople != null) {
            // TO implementate
            return peopleRepository.save(existingPeople);
        } else {
            return null;
        }
    }

    public boolean deletePeople(Long id) {
        if (peopleRepository.existsById(id)) {
            peopleRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
