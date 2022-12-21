package com.example.demo.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.EventModel;
import com.example.demo.dto.EventDto;


public interface IEventDao extends JpaRepository<EventModel, Long>{

	
	public Optional<EventModel> findById(Long id);
	
	// public List<EventModel> findByState(boolean state);

	public List<EventModel> findAll();
	
	public EventDto save(EventDto eventDto);
	public EventDto update(EventDto eventDto);

}
