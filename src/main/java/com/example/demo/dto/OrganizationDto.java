package com.example.demo.dto;

import java.sql.Date;

import lombok.Data;


@Data
public class OrganizationDto {
    private String Code;
    private String Name;
    private String Cuit;
    private String Direction;
    private long Telephone;
    private String Email;
    private Date create_at;
    
}
