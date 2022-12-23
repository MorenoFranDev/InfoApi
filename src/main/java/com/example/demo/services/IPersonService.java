package com.example.demo.services;

import java.util.List;

import com.example.demo.Models.PersonModel;
import com.example.demo.dto.PersonDto;

public interface IPersonService {
    public List<PersonModel> findAll();
    public PersonDto save(PersonDto personDto);
    // public PersonDto update(PersonDto personDto);
}
