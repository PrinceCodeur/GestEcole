package com.ecole.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Inscription implements Serializable {
    @Id
    @GeneratedValue
    private int id_inscription;
    @ManyToOne
    @JoinColumn(name = "id_eleve")
    private Eleve eleve;
    @ManyToOne
    @JoinColumn(name = "id_classe")
    private Classe classe;
    @ManyToOne
    @JoinColumn(name = "id_annee")
    private AnneeScolaire annee;

    public Inscription() {
        super();
    }

    public Inscription(Eleve eleve, Classe classe, AnneeScolaire annee) {
        super();
        this.eleve = eleve;
        this.classe = classe;
        this.annee = annee;
    }

    public int getId_inscription() {
        return id_inscription;
    }

    public void setId_inscription(int id_inscription) {
        this.id_inscription = id_inscription;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public AnneeScolaire getAnnee() {
        return annee;
    }

    public void setAnnee(AnneeScolaire annee) {
        this.annee = annee;
    }
    
}
