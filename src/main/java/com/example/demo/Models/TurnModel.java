package com.example.demo.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Turn")
@Data
public class TurnModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private long IdTurn = System.nanoTime();
    @ManyToOne
    @JoinColumn(name = "event", referencedColumnName = "id")
    private EventModel event;
    @ManyToOne
    @JoinColumn(name = "person", referencedColumnName = "Dni")
    private PersonModel personModel;
    @ManyToOne
    @JoinColumn(name="organization",referencedColumnName="Code")
    private OrganizationModel organizationModel;

}
