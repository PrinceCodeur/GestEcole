package com.ecole.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bulletin implements Serializable {
    
    @Id
    @GeneratedValue
    private int id_bulletin;
    @ManyToOne
    @JoinColumn(name = "id_eleve")
    private Eleve eleve;
    @ManyToOne
    @JoinColumn(name = "id_annee")
    private AnneeScolaire annee;
    @ManyToOne
    @JoinColumn(name = "id_trimestre")
    private Trimestre trimestre;
    private String conduite;
    private String decision;

    public Bulletin() {
        super();
    }

    public Bulletin(Eleve eleve, AnneeScolaire annee, Trimestre trimestre, String conduite, String decision) {
        super();
        this.eleve = eleve;
        this.annee = annee;
        this.trimestre = trimestre;
        this.conduite = conduite;
        this.decision = decision;
    }

    public int getId_bulletin() {
        return id_bulletin;
    }

    public void setId_bulletin(int id_bulletin) {
        this.id_bulletin = id_bulletin;
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

    public Trimestre getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(Trimestre trimestre) {
        this.trimestre = trimestre;
    }

    public String getConduite() {
        return conduite;
    }

    public void setConduite(String conduite) {
        this.conduite = conduite;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }
    
}
