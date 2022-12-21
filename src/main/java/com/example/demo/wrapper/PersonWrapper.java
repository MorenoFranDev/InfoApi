package com.example.demo.wrapper;

import com.example.demo.Models.PersonModel;
import com.example.demo.dto.PersonDto;

public class PersonWrapper {
    public static PersonDto EntityToDto(PersonModel personModel){
        PersonDto personDto = new PersonDto();
        personDto.setDni(personModel.getDni());
        personDto.setLastname(personModel.getLastname());
        personDto.setName(personModel.getName());
        personDto.setPassword(personModel.getPassword());
        personDto.setState(personModel.isState());
        return personDto;
    }

    public static PersonModel DtoToEntity(PersonDto personDto){
        PersonModel personModel = new PersonModel();
        personModel.setDni(personDto.getDni());
        personModel.setLastname(personDto.getLastname());
        personModel.setName(personDto.getName());
        personModel.setPassword(personDto.getPassword());
        personModel.setState(personDto.isState());
        return personModel;
    }
}
