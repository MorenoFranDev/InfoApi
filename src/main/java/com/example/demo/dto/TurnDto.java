package com.example.demo.dto;

public class TurnDto {
    private long IdTurn;
    private long event;
    private long personModel;
    private String organization;
    public TurnDto() {
    }
    public TurnDto(long idTurn, long event, long personModel, String organization) {
        IdTurn = idTurn;
        this.event = event;
        this.personModel = personModel;
        this.organization = organization;
    }
    public long getIdTurn() {
        return IdTurn;
    }
    public void setIdTurn(long idTurn) {
        IdTurn = idTurn;
    }
    public long getEvent() {
        return event;
    }
    public void setEvent(long event) {
        this.event = event;
    }
    public long getPersonModel() {
        return personModel;
    }
    public void setPersonModel(long personModel) {
        this.personModel = personModel;
    }
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    
}
