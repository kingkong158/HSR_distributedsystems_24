package de.pan.todofrontend.model;

public class Fusballkarten {
    private String spielername;
    private String manschaft;
    private String position;

    public Fusballkarten() {
    }

    public Fusballkarten(String spielername, String manschaft, String position) {
        this.spielername = spielername;
        this.manschaft = manschaft;
        this.position = position;
    }

    public String getSpielername() {
        return spielername;
    }

    public void setSpielername(String spielername){
        this.spielername = spielername;
    }

    public String getManschaft(){
        return manschaft;
    }

    public void setManschaft(String manschaft){
        this.manschaft = manschaft;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

}
