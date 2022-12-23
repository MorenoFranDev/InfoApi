package com.example.demo.services;

import java.util.List;

import com.example.demo.Models.EventModel;
import com.example.demo.dto.EventDto;

public interface IEventService{
	public List<EventModel> findAll();
    public EventModel findById(Long id);
    public EventDto save(EventDto eventDto);
    public EventDto update(EventDto eventDto);
}
