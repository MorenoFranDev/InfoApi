package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.EventModel;


public interface IEventDao extends JpaRepository<EventModel, Long>{
	public Optional<EventModel> findById(Long id);
	public List<EventModel> findAll();
}
