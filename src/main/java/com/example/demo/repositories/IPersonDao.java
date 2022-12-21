package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.PersonModel;
import com.example.demo.dto.PersonDto;

public interface IPersonDao extends JpaRepository<PersonModel,Long>{
    public PersonModel findCode(Long Dni);
	public List<PersonModel> findAll();
	public List<PersonModel> findLastName(String lastName);
	public PersonDto save(PersonDto personDto);
	public PersonDto update(PersonDto personDto);
}
