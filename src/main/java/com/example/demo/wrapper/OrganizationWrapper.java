package com.example.demo.wrapper;

import com.example.demo.Models.OrganizationModel;
import com.example.demo.dto.OrganizationDto;

public class OrganizationWrapper {

    public static OrganizationModel DtoToEntity(OrganizationDto organizationDto) {
        OrganizationModel organizationModel = new OrganizationModel();
        organizationModel.setCode(organizationDto.getCode());
        organizationModel.setCreate_at(organizationDto.getCreate_at());
        organizationModel.setCuit(organizationDto.getCuit());
        organizationModel.setDirection(organizationDto.getDirection());
        organizationModel.setEmail(organizationDto.getEmail());
        organizationModel.setName(organizationDto.getName());
        organizationModel.setTelephone(organizationDto.getTelephone());
        return organizationModel;
    }

    public static OrganizationDto EntityToDto(OrganizationModel organization) {
        OrganizationDto organizationDto = new OrganizationDto();
        organizationModel.setCode(organization.getCode());
        organizationModel.setCreate_at(organization.getCreate_at());
        organizationModel.setCuit(organization.getCuit());
        organizationModel.setDirection(organization.getDirection());
        organizationModel.setEmail(organization.getEmail());
        organizationModel.setName(organization.getName());
        organizationModel.setTelephone(organization.getTelephone());
        return organizationModel;
    }
}
