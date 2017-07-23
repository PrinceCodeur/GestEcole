package com.ecole.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Absence implements Serializable {

    @Id
    @GeneratedValue
    private int id_absence;
    @ManyToOne
    @JoinColumn(name = "id_annee")
    private AnneeScolaire annee;
    @ManyToOne
    @JoinColumn(name = "id_eleve")
    private Eleve eleve;
    private int nbre_heure;
    private boolean justifier;

    public Absence() {
        super();
    }

    public Absence(AnneeScolaire annee, Eleve eleve, int nbre_heure, boolean justifier) {
        super();
        this.annee = annee;
        this.eleve = eleve;
        this.nbre_heure = nbre_heure;
        this.justifier = justifier;
    }

    public int getId_absence() {
        return id_absence;
    }

    public void setId_absence(int id_absence) {
        this.id_absence = id_absence;
    }

    public AnneeScolaire getAnnee() {
        return annee;
    }

    public void setAnnee(AnneeScolaire annee) {
        this.annee = annee;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public int getNbre_heure() {
        return nbre_heure;
    }

    public void setNbre_heure(int nbre_heure) {
        this.nbre_heure = nbre_heure;
    }

    public boolean isJustifier() {
        return justifier;
    }

    public void setJustifier(boolean justifier) {
        this.justifier = justifier;
    }

}
