package de.pan.todobackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fusballspieler_karte")
public class Fusballkarten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kartenNr;
    private String spielername;
    private String manschaft;
    private String position;
    private int marktwert;
    
    public Fusballkarten() {
    }

    public Fusballkarten(int kartenNr, String spielername, String manschaft, String position, int marktwert) {
        this.kartenNr = kartenNr;
        this.spielername = spielername;
        this.manschaft = manschaft;
        this.position = position;
        this.marktwert = marktwert;
    }

    public int getKartenNr() {
        return kartenNr;
    }

    public void setKartenNr(int kartenNr) {
        this.kartenNr = kartenNr;
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

    public int getMarktwert(){
        return marktwert;
    }

    public void setMarktwert(int marktwert){
        this.marktwert = marktwert;
    }

}
