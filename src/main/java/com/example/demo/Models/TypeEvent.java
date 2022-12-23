package com.example.demo.Models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "typeEvent")
public class TypeEvent  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique= true, nullable = false)
    private int Id;
    private String Name;
    public TypeEvent() {
    }
    public TypeEvent(int id, String name) {
        Id = id;
        Name = name;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    
  
}