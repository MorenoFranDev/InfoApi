package com.example.demo.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "organization")
public class OrganizationModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String Code;
    private String Name;
    private String Cuit;
    private String Direction;
    private long Telephone;
    private String Email;
    private Date Create;
    public OrganizationModel() {
    }
    public OrganizationModel(String code, String name, String cuit, String direction, long telephone, String email,
            Date create) {
        Code = code;
        Name = name;
        Cuit = cuit;
        Direction = direction;
        Telephone = telephone;
        Email = email;
        Create = create;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
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
    public Date getCreate() {
        return Create;
    }
    public void setCreate(Date create) {
        Create = create;
    }


    


}
