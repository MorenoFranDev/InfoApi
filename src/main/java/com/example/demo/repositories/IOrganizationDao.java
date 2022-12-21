package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.OrganizationModel;
import com.example.demo.dto.OrganizationDto;

public interface IOrganizationDao extends JpaRepository<OrganizationModel,Long> {
    public OrganizationModel findCode(String code);
	public List<OrganizationModel> findAll();
	public OrganizationDto save(OrganizationDto organizationDto);
	public OrganizationDto update(OrganizationDto organizationDto);

}
