package com.example.demo.services;

import java.util.List;

import com.example.demo.Models.EventModel;
import com.example.demo.dto.EventDto;
import com.example.demo.repositories.IEventDao;
import com.example.demo.wrapper.EventWrapper;

public class EventServiceImp implements IEventService {

    IEventDao eventDao;

    @Override
    public EventModel findById(Long id) {
        EventModel eventModel = eventDao.findById(id).orElse(new EventModel());   
        return eventModel;
    }

    @Override
    public List<EventModel> findAll(){
        return (List<EventModel>) eventDao.findAll();
    }

    @Override
    public EventDto save(EventDto eventDto){
        EventModel event = EventWrapper.dtoeventToEntity(eventDto);
        event = eventDao.save(event);
        eventDto = EventWrapper.eventEntityToDto(event);
        return eventDto;
    }

    @Override
    public EventDto update(EventDto eventDto) {
        EventModel eventExist = eventDao.findById(eventDto.getId()).orElse(new EventModel());
        if (eventExist == null) {
            return null;
        } else {
            EventDto entityEvent = new EventDto();
            entityEvent.setDateEvent(eventDto.getDateEvent());
            entityEvent.setId(eventDto.getId());
            entityEvent.setName(eventDto.getName());
            entityEvent.setOrganizationModel(eventDto.getOrganizationModel());
            entityEvent.setState(eventDto.isState());
            entityEvent.setTypeEvent(eventDto.getTypeEvent());
            entityEvent.setUbication(eventDto.getUbication());
            return entityEvent;
        }
    }
}
