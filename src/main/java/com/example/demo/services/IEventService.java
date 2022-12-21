package com.example.demo.services;

import java.util.List;

import com.example.demo.Models.EventModel;
import com.example.demo.dto.EventDto;


public interface IEventService{
	
	public EventDto findByEventId(Long id);
	public List<EventModel> findAll();
	public EventDto save(EventDto eventDto);
	public EventDto update(EventDto eventDto);
	// public List<EventModel> findByState(boolean state);

}
