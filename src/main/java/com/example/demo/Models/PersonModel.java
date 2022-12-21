package com.example.demo.Models;
import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "person")
@Data
public class PersonModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(unique = true, nullable = false)
    private long Dni;
    private String Name;
    private String Lastname;
    private String Password;
    private boolean State;

}
