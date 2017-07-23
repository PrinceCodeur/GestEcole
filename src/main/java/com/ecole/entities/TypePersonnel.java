package com.ecole.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypePersonnel implements Serializable {

    @Id
    @GeneratedValue
    private int id_type;
    private String libelle_type;
    private double salaire;
    @OneToMany(mappedBy="typePersonnel",fetch=FetchType.LAZY)
    private Collection<Personnel> personnels;

    public TypePersonnel() {
        super();
    }

    public TypePersonnel(String libelle_type, double salaire) {
        super();
        this.libelle_type = libelle_type;
        this.salaire = salaire;
    }

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public String getLibelle_type() {
        return libelle_type;
    }

    public void setLibelle_type(String libelle_type) {
        this.libelle_type = libelle_type;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Collection<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(Collection<Personnel> personnels) {
        this.personnels = personnels;
    }
    
}
