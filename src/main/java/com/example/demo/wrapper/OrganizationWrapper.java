package com.example.demo.wrapper;

import com.example.demo.Models.OrganizationModel;
import com.example.demo.dto.OrganizationDto;

public class OrganizationWrapper {

    public static OrganizationModel DtoToEntity(OrganizationDto organizationDto) {
        OrganizationModel organizationModel = new OrganizationModel();
        organizationModel.setCode(organizationDto.getCode());
        organizationModel.setCreate(organizationDto.getCreate());
        organizationModel.setCuit(organizationDto.getCuit());
        organizationModel.setDirection(organizationDto.getDirection());
        organizationModel.setEmail(organizationDto.getEmail());
        organizationModel.setName(organizationDto.getName());
        organizationModel.setTelephone(organizationDto.getTelephone());
        return organizationModel;
    }

    public static OrganizationDto EntityToDto(OrganizationModel organization) {
        OrganizationDto organizationDto = new OrganizationDto();
        organizationDto.setCode(organization.getCode());
        organizationDto.setCreate(organization.getCreate());
        organizationDto.setCuit(organization.getCuit());
        organizationDto.setDirection(organization.getDirection());
        organizationDto.setEmail(organization.getEmail());
        organizationDto.setName(organization.getName());
        organizationDto.setTelephone(organization.getTelephone());
        return organizationDto;
    }
}
