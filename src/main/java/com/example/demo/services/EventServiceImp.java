package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Models.EventModel;
import com.example.demo.dto.EventDto;
import com.example.demo.repositories.IEventDao;
import com.example.demo.wrapper.EventWrapper;

@Service
public class EventServiceImp implements IEventService {

    IEventDao eventDao;

    @Override
    public EventDto findByEventId(Long id) {
        EventModel eventModel = eventDao.getById(id);   
        return EventWrapper.eventEntityToDto(eventModel);
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
    // public List<EventModel> findByState(boolean state){
    //     return (List<EventModel>) eventDao.findByState(state);
    // }

    @Override
    public EventDto update(EventDto eventDto) {
        EventModel eventExist = eventDao.getById(eventDto.getId());
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
