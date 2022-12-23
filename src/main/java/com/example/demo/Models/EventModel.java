package com.example.demo.Models;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "event")

public class EventModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private long id;
    private String Ubication;
    private boolean State;
    private Date DateEvent;
    private String Name;

    @ManyToOne
    @JoinColumn(name="CodeOrganization",referencedColumnName = "Code")
    private OrganizationModel organizationModel;
    
    @ManyToOne
    @JoinColumn(name="typeEvent",referencedColumnName = "Id")//único u ocasional 
    private TypeEvent typeEvent;

    public EventModel() {
    }

    public EventModel(long id, String ubication, boolean state, Date dateEvent, String name,
            OrganizationModel organizationModel, TypeEvent typeEvent) {
        this.id = id;
        Ubication = ubication;
        State = state;
        DateEvent = dateEvent;
        Name = name;
        this.organizationModel = organizationModel;
        this.typeEvent = typeEvent;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUbication() {
        return Ubication;
    }

    public void setUbication(String ubication) {
        Ubication = ubication;
    }

    public boolean isState() {
        return State;
    }

    public void setState(boolean state) {
        State = state;
    }

    public Date getDateEvent() {
        return DateEvent;
    }

    public void setDateEvent(Date dateEvent) {
        DateEvent = dateEvent;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public OrganizationModel getOrganizationModel() {
        return organizationModel;
    }

    public void setOrganizationModel(OrganizationModel organizationModel) {
        this.organizationModel = organizationModel;
    }

    public TypeEvent getTypeEvent() {
        return typeEvent;
    }

    public void setTypeEvent(TypeEvent typeEvent) {
        this.typeEvent = typeEvent;
    }
        
    
}
