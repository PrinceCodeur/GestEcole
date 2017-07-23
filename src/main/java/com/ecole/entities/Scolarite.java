package com.ecole.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Scolarite implements Serializable {

    @Id
    @GeneratedValue
    private int id_scolarite;
    private double montant;
    private double montant_ape;
    private double frais_inscription;
    @OneToMany(mappedBy="scolarite",fetch=FetchType.LAZY)
    private Collection<Classe> classes;

    public Scolarite() {
        super();
    }

    public Scolarite(double montant, double montant_ape, double frais_inscription) {
        super();
        this.montant = montant;
        this.montant_ape = montant_ape;
        this.frais_inscription = frais_inscription;
    }

    public int getId_scolarite() {
        return id_scolarite;
    }

    public void setId_scolarite(int id_scolarite) {
        this.id_scolarite = id_scolarite;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMontant_ape() {
        return montant_ape;
    }

    public void setMontant_ape(double montant_ape) {
        this.montant_ape = montant_ape;
    }

    public double getFrais_inscription() {
        return frais_inscription;
    }

    public void setFrais_inscription(double frais_inscription) {
        this.frais_inscription = frais_inscription;
    }

    public Collection<Classe> getClasses() {
        return classes;
    }

    public void setClasses(Collection<Classe> classes) {
        this.classes = classes;
    }
    
}
