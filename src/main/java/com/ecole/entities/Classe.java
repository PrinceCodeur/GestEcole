package com.ecole.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Classe implements Serializable {
    
    @Id
    @GeneratedValue
    private int id_classe;
    @ManyToOne
    @JoinColumn(name = "id_annee")
    private AnneeScolaire annee;
    @ManyToOne
    @JoinColumn(name = "id_scolarite")
    private Scolarite scolarite;
    private String libelle_classe;
    private int effectif;
    @OneToMany(mappedBy="classe",fetch=FetchType.LAZY)
    private Collection<Eleve> eleves;
    @OneToMany(mappedBy="classe",fetch=FetchType.LAZY)
    private Collection<Matiere> matieres;

    public Classe() {
        super();
    }

    public Classe(AnneeScolaire annee, Scolarite scolarite, String libelle_classe, int effectif) {
        super();
        this.annee = annee;
        this.scolarite = scolarite;
        this.libelle_classe = libelle_classe;
        this.effectif = effectif;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public AnneeScolaire getAnnee() {
        return annee;
    }

    public void setAnnee(AnneeScolaire annee) {
        this.annee = annee;
    }

    public Scolarite getScolarite() {
        return scolarite;
    }

    public void setScolarite(Scolarite scolarite) {
        this.scolarite = scolarite;
    }

    public String getLibelle_classe() {
        return libelle_classe;
    }

    public void setLibelle_classe(String libelle_classe) {
        this.libelle_classe = libelle_classe;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    public Collection<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(Collection<Eleve> eleves) {
        this.eleves = eleves;
    }

    public Collection<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(Collection<Matiere> matieres) {
        this.matieres = matieres;
    }
    
}
