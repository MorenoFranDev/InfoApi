package com.example.demo.services;

import java.util.List;

import com.example.demo.Models.PersonModel;
import com.example.demo.dto.PersonDto;
import com.example.demo.repositories.IPersonDao;
import com.example.demo.wrapper.PersonWrapper;

public class PersonServiceImp implements IPersonService{

    IPersonDao personDao;


    @Override
    public List<PersonModel> findAll() {
        List<PersonModel> persons = personDao.findAll(); 
        return persons;
    }

    @Override
    public PersonDto save(PersonDto personDto) {
        PersonModel person = PersonWrapper.DtoToEntity(personDto);
        person = personDao.save(person);
        personDto = PersonWrapper.EntityToDto(person);
        return personDto;
    }

    // public List<PersonModel> findLastName(String Lastname){
    //     List<PersonModel> persons = personDao.findLastname(Lastname);
    //     return persons;
    // }



    // @Override
    // public PersonDto update(PersonDto personDto) {
    //     PersonModel personExist = personDao.findPerson(personDto.getDni());
    //     if(personExist == null)return null;
    //     else{
    //         PersonDto person = new PersonDto();
    //         person.setDni(personDto.getDni());
    //         person.setLastname(personDto.getLastname());
    //         person.setName(personDto.getName());
    //         person.setPassword(personDto.getPassword());
    //         person.setState(personDto.isState());
    //         return person;
    //     }
    // }

}
