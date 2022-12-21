package com.example.demo.dto;

import lombok.Data;

@Data
public class PersonDto {
    private long Dni;
    private String Name;
    private String Lastname;
    private String Password;
    private boolean State;
}
