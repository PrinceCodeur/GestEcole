package com.ecole.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Note implements Serializable {
    @Id
    @GeneratedValue
    private int id_note;
    @ManyToOne
    @JoinColumn(name = "id_matiere")
    private Matiere matiere;
    @ManyToOne
    @JoinColumn(name = "id_eleve")
    private Eleve eleve;
    @ManyToOne
    @JoinColumn(name = "id_annee")
    private AnneeScolaire annee;
    @ManyToOne
    @JoinColumn(name = "id_trimestre")
    private Trimestre trimestre;
    private String libelle_note;
    private double note;
    private Date date_note;

    public Note() {
        super();
    }

    public Note(Matiere matiere, Eleve eleve, AnneeScolaire annee, Trimestre trimestre, String libelle_note, double note, Date date_note) {
        super();
        this.matiere = matiere;
        this.eleve = eleve;
        this.annee = annee;
        this.trimestre = trimestre;
        this.libelle_note = libelle_note;
        this.note = note;
        this.date_note = date_note;
    }

    public int getId_note() {
        return id_note;
    }

    public void setId_note(int id_note) {
        this.id_note = id_note;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
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

    public String getLibelle_note() {
        return libelle_note;
    }

    public void setLibelle_note(String libelle_note) {
        this.libelle_note = libelle_note;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Date getDate_note() {
        return date_note;
    }

    public void setDate_note(Date date_note) {
        this.date_note = date_note;
    }
    
}
