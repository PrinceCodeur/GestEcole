package com.ecole.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Versement implements Serializable {

    @Id
    @GeneratedValue
    private int id_versement;
    @ManyToOne
    @JoinColumn(name = "id_eleve")
    private Eleve eleve;
    @ManyToOne
    @JoinColumn(name = "id_annee")
    private AnneeScolaire annee;
    private String libelle_versement;
    private double somme_verser;
    private double somme_restant;
    private double total_verser;

    public Versement() {
        super();
    }

    public Versement(Eleve eleve, AnneeScolaire annee, String libelle_versement, double somme_verser, double somme_restant, double total_verser) {
        super();
        this.eleve = eleve;
        this.annee = annee;
        this.libelle_versement = libelle_versement;
        this.somme_verser = somme_verser;
        this.somme_restant = somme_restant;
        this.total_verser = total_verser;
    }

    public int getId_versement() {
        return id_versement;
    }

    public void setId_versement(int id_versement) {
        this.id_versement = id_versement;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public AnneeScolaire getAnnee() {
        return annee;
    }

    public void setAnnee(AnneeScolaire annee) {
        this.annee = annee;
    }

    public String getLibelle_versement() {
        return libelle_versement;
    }

    public void setLibelle_versement(String libelle_versement) {
        this.libelle_versement = libelle_versement;
    }

    public double getSomme_verser() {
        return somme_verser;
    }

    public void setSomme_verser(double somme_verser) {
        this.somme_verser = somme_verser;
    }

    public double getSomme_restant() {
        return somme_restant;
    }

    public void setSomme_restant(double somme_restant) {
        this.somme_restant = somme_restant;
    }

    public double getTotal_verser() {
        return total_verser;
    }

    public void setTotal_verser(double total_verser) {
        this.total_verser = total_verser;
    }
    
}
