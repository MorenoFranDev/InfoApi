package com.example.demo.services;

import java.util.List;

import com.example.demo.Models.OrganizationModel;
import com.example.demo.dto.OrganizationDto;
import com.example.demo.repositories.IOrganizationDao;
import com.example.demo.wrapper.OrganizationWrapper;

public class OrganizationServiceImp implements IOrganizationService {

    IOrganizationDao organizationDao;

    @Override
    public OrganizationDto findCode(String Code) {
        OrganizationModel organizationModel = organizationDao.findCode(Code);
        return OrganizationWrapper.EntityToDto(organizationModel);
    }

    @Override
    public List<OrganizationModel> findAll() {
        List<OrganizationModel> organizations = organizationDao.findAll();
        return organizations;
    }

    @Override
    public OrganizationDto save(OrganizationDto organizationDto) {
        OrganizationModel organizationModel = OrganizationWrapper.DtoToEntity(organizationDto);
        organizationModel = organizationDao.save(organizationModel);
        organizationDto = OrganizationWrapper.EntityToDto(organizationModel);
        return organizationDto;
    }

    @Override
    public OrganizationDto update(OrganizationDto organizationDto) {
        OrganizationModel organizationExist = organizationDao.findCode(organizationDto.getCode());
        if (organizationExist == null)
            return null;
        else {
            OrganizationDto organization = new OrganizationDto();
            organization.setCode(organizationDto.getCode());
            organization.setCreate_at(organizationDto.getCreate_at());
            organization.setCuit(organizationDto.getCuit());
            organization.setDirection(organizationDto.getDirection());
            organization.setName(organizationDto.getName());
            organization.setTelephone(organizationDto.getTelephone());
            return organization;
        }
    }

}
