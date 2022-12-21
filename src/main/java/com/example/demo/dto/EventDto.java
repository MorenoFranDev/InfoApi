package com.example.demo.dto;

import java.util.Date;
import com.example.demo.Models.OrganizationModel;
import com.example.demo.Models.TypeEvent;

public class EventDto {
    // @NotBlank(message = "El campo ubicacion no puede estar vacio")
    // @Size(min = 10, max = 30, message = "Ubicacion debe tener entre 10 y 30
    // caracteres")
    private String Ubication;
    private boolean State;
    private Date DateEvent;
    // @NotBlank(message = "El campo nombre no puede estar vacio")
    // @Size(min = 4, max= 20, message = "El nombre debe ser tener entre 4 y 20
    // caracteres")
    private String Name;
    private long id;
    // @NotBlank(message = "El campo organizacion no puede estar vacio")
    // @Size(min = 4, max= 20, message = "El nombre de organizacion debe tener 20
    // entre 40 caracteres.")
    private OrganizationModel organizationModel;
    // @Size(min = 1, max= 1, message = "El Tipo de evento debe ser numerico de 1
    // caracter")
    private TypeEvent typeEvent;

    public EventDto() {
    }

    public EventDto(String ubication, boolean state, Date dateEvent, String name, long id,
            OrganizationModel organizationModel, TypeEvent typeEvent) {
        Ubication = ubication;
        State = state;
        DateEvent = dateEvent;
        Name = name;
        this.id = id;
        this.organizationModel = organizationModel;
        this.typeEvent = typeEvent;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
