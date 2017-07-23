package com.ecole.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Matiere implements Serializable {
    @Id
    @GeneratedValue
    private int id_matiere;
    private String libelle_matiere;
    private int coeficient;
    @OneToMany(mappedBy="matiere",fetch=FetchType.LAZY)
    private Collection<Classe> classes;
    @OneToMany(mappedBy="matiere",fetch=FetchType.LAZY)
    private Collection<Personnel> personnels;
    @OneToMany(mappedBy="matiere",fetch=FetchType.LAZY)
    private Collection<Eleve> eleves;

    public Matiere() {
        super();
    }

    public Matiere(String libelle_matiere, int coeficient) {
        super();
        this.libelle_matiere = libelle_matiere;
        this.coeficient = coeficient;
    }

    public int getId_matiere() {
        return id_matiere;
    }

    public void setId_matiere(int id_matiere) {
        this.id_matiere = id_matiere;
    }

    public String getLibelle_matiere() {
        return libelle_matiere;
    }

    public void setLibelle_matiere(String libelle_matiere) {
        this.libelle_matiere = libelle_matiere;
    }

    public int getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }

    public Collection<Classe> getClasses() {
        return classes;
    }

    public void setClasses(Collection<Classe> classes) {
        this.classes = classes;
    }

    public Collection<Personnel> getPersonnels() {
        return personnels;
    }

    public void setPersonnels(Collection<Personnel> personnels) {
        this.personnels = personnels;
    }

    public Collection<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(Collection<Eleve> eleves) {
        this.eleves = eleves;
    }
    
}
