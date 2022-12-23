package com.example.demo.Models;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class PersonModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(unique = true, nullable = false)
    private String Dni;
    private String Name;
    private String Lastname;
    private String Password;
    private boolean State;
    public PersonModel() {
    }
    public PersonModel(String dni, String name, String lastname, String password, boolean state) {
        Dni = dni;
        Name = name;
        Lastname = lastname;
        Password = password;
        State = state;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
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
