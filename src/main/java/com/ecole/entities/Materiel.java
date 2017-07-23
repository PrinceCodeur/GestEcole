package com.ecole.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Materiel implements Serializable {
    @Id
    @GeneratedValue
    private int id_materiel;
    @ManyToOne
    @JoinColumn(name = "id_annee")
    private AnneeScolaire annee;
    private String libelle_materiel;
    private String emplacement;
    private int quantite;

    public Materiel() {
        super();
    }

    public Materiel(AnneeScolaire annee, String libelle_materiel, String emplacement, int quantite) {
        super();
        this.annee = annee;
        this.libelle_materiel = libelle_materiel;
        this.emplacement = emplacement;
        this.quantite = quantite;
    }

    public int getId_materiel() {
        return id_materiel;
    }

    public void setId_materiel(int id_materiel) {
        this.id_materiel = id_materiel;
    }

    public AnneeScolaire getAnnee() {
        return annee;
    }

    public void setAnnee(AnneeScolaire annee) {
        this.annee = annee;
    }

    public String getLibelle_materiel() {
        return libelle_materiel;
    }

    public void setLibelle_materiel(String libelle_materiel) {
        this.libelle_materiel = libelle_materiel;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
}
