package com.example.demo.wrapper;

import com.example.demo.Models.EventModel;
import com.example.demo.dto.EventDto;

public class EventWrapper {
    public static EventModel dtoeventToEntity(EventDto eventDto) {
        if (eventDto == null)
            return new EventModel();
        EventModel entity = new EventModel();
        entity.setName(eventDto.getName());
        entity.setDateEvent(eventDto.getDateEvent());
        entity.setOrganizationModel(eventDto.getOrganizationModel());
        entity.setUbication(eventDto.getUbication());
        entity.setTypeEvent(eventDto.getTypeEvent());
        entity.setState(eventDto.isState());

        return entity;
    }

    public static EventDto eventEntityToDto(EventModel eventModel) {
        if (eventModel == null)
            return new EventDto();
        EventDto eventDto = new EventDto();
        eventDto.setName(eventModel.getName());
        eventDto.setDateEvent(eventModel.getDateEvent());
        eventDto.setOrganizationModel(eventModel.getOrganizationModel());
        eventDto.setUbication(eventModel.getUbication());
        eventDto.setState(eventModel.isState());
        return eventDto;
    }

}
