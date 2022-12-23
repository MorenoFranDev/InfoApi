package com.example.demo.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Turn")
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
    public TurnModel() {
    }
    public TurnModel(long idTurn, EventModel event, PersonModel personModel, OrganizationModel organizationModel) {
        IdTurn = idTurn;
        this.event = event;
        this.personModel = personModel;
        this.organizationModel = organizationModel;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public long getIdTurn() {
        return IdTurn;
    }
    public void setIdTurn(long idTurn) {
        IdTurn = idTurn;
    }
    public EventModel getEvent() {
        return event;
    }
    public void setEvent(EventModel event) {
        this.event = event;
    }
    public PersonModel getPersonModel() {
        return personModel;
    }
    public void setPersonModel(PersonModel personModel) {
        this.personModel = personModel;
    }
    public OrganizationModel getOrganizationModel() {
        return organizationModel;
    }
    public void setOrganizationModel(OrganizationModel organizationModel) {
        this.organizationModel = organizationModel;
    }

    
}
