package com.example.demo.service;

import com.example.demo.dto.PersonDto;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
public class PersonServiceImpl implements PersonService {

    private static final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);
    private final PersonRepository repo;

    public PersonServiceImpl(PersonRepository repo) {
        this.repo = repo;
    }

    @Override
    public PersonDto getById(Long id) {
        Person person = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Person", "id", id));
        return toDto(person);
    }

    private PersonDto toDto(Person person) {
        PersonDto dto = new PersonDto();
        dto.setPersonIdExternal(person.getPersonIdExternal());
        dto.setDateOfBirth(person.getDateOfBirth());
        dto.setLastModifiedOn(person.getLastModifiedOn());
        dto.setLastModifiedDateTime(person.getLastModifiedDateTime());
        dto.setDateOfDeath(person.getDateOfDeath());
        dto.setCreatedOn(person.getCreatedOn());
        dto.setCountryOfBirth(person.getCountryOfBirth());
        dto.setCreatedBy(person.getCreatedBy());
        dto.setCreatedDateTime(person.getCreatedDateTime());
        dto.setLastModifiedBy(person.getLastModifiedBy());
        dto.setPersonId(person.getPersonId());
        return dto;
    }
}