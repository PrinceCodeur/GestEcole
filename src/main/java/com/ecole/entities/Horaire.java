package com.ecole.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Horaire implements Serializable {
    @Id
    @GeneratedValue
    private int id_horaire;
    @ManyToOne
    @JoinColumn(name = "id_personnel")
    private Personnel personnel;
    @ManyToOne
    @JoinColumn(name = "id_annee")
    private AnneeScolaire annee;
    private int nbre_heure_effectuer;
    private int cumul_horaire;
    private Date date;

    public Horaire() {
        super();
    }

    public Horaire(Personnel personnel, AnneeScolaire annee, int nbre_heure_effectuer, int cumul_horaire, Date date) {
        super();
        this.personnel = personnel;
        this.annee = annee;
        this.nbre_heure_effectuer = nbre_heure_effectuer;
        this.cumul_horaire = cumul_horaire;
        this.date = date;
    }

    public int getId_horaire() {
        return id_horaire;
    }

    public void setId_horaire(int id_horaire) {
        this.id_horaire = id_horaire;
    }

    public Personnel getId_personnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    public AnneeScolaire getAnnee() {
        return annee;
    }

    public void setAnnee(AnneeScolaire annee) {
        this.annee = annee;
    }

    public int getNbre_heure_effectuer() {
        return nbre_heure_effectuer;
    }

    public void setNbre_heure_effectuer(int nbre_heure_effectuer) {
        this.nbre_heure_effectuer = nbre_heure_effectuer;
    }

    public int getCumul_horaire() {
        return cumul_horaire;
    }

    public void setCumul_horaire(int cumul_horaire) {
        this.cumul_horaire = cumul_horaire;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
