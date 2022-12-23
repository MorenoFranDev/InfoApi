package com.example.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.PersonModel;

public interface IPersonDao extends JpaRepository<PersonModel,Long>{
	public List<PersonModel> findAll();
	// public List<PersonModel> findLastname(String lastname);
	
}
