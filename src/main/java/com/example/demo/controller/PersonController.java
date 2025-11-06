package com.example.demo.controller;

import com.example.demo.dto.PersonDto;
import com.example.demo.service.PersonService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) { this.service = service; }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }
}