package com.example.demo.dto;


public class PersonDto {
    private String Dni;
    private String Name;
    private String Lastname;
    private String Password;
    private boolean State;
    public PersonDto() {
    }
    public PersonDto(String dni, String name, String lastname, String password, boolean state) {
        Dni = dni;
        Name = name;
        Lastname = lastname;
        Password = password;
        State = state;
    }
    public String getDni() {
        return Dni;
    }
    public void setDni(String dni) {
        Dni = dni;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public boolean isState() {
        return State;
    }
    public void setState(boolean state) {
        State = state;
    }

    

}
