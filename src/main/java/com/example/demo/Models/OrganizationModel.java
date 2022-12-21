package com.example.demo.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "organization")
public class OrganizationModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Code;
    private String Name;
    private String Cuit;
    private String Direction;
    private long Telephone;
    private String Email;
    private Date create_at;

 
}
