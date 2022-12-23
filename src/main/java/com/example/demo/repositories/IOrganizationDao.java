package com.example.demo.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.OrganizationModel;

public interface IOrganizationDao extends JpaRepository<OrganizationModel,Long> {
    // public OrganizationModel findByCode(String Code);
	public List<OrganizationModel> findAll();
}
