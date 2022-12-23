package com.example.demo.dto;

import java.util.Date;

public class OrganizationDto {
    private String Code;
    private String Name;
    private String Cuit;
    private String Direction;
    private long Telephone;
    private String Email;
    private java.util.Date Create;
    public OrganizationDto() {
    }
    public OrganizationDto(String code, String name, String cuit, String direction, long telephone, String email,
            Date create) {
        Code = code;
        Name = name;
        Cuit = cuit;
        Direction = direction;
        Telephone = telephone;
        Email = email;
        Create = create;
    }
    public String getCode() {
        return Code;
    }
    public void setCode(String code) {
        Code = code;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getCuit() {
        return Cuit;
    }
    public void setCuit(String cuit) {
        Cuit = cuit;
    }
    public String getDirection() {
        return Direction;
    }
    public void setDirection(String direction) {
        Direction = direction;
    }
    public long getTelephone() {
        return Telephone;
    }
    public void setTelephone(long telephone) {
        Telephone = telephone;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public java.util.Date getCreate() {
        return Create;
    }
    public void setCreate(java.util.Date create) {
        Create = create;
    }

    
    
}
