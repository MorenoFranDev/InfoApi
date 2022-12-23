package com.example.demo.services;

import java.util.List;

import com.example.demo.Models.OrganizationModel;
import com.example.demo.dto.OrganizationDto;

public interface IOrganizationService{
    // public OrganizationModel findByCode(String Code);
    public List<OrganizationModel> findAll();
    public OrganizationDto save(OrganizationDto organizationDto);
    // public OrganizationDto update(OrganizationDto organizationDto);
}
