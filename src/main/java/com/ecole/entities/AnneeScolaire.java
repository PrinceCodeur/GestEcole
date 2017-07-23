package com.ecole.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AnneeScolaire implements Serializable {
    @Id @GeneratedValue
    private int id_annee;
    private String libelle_annee;
    @OneToMany(mappedBy="annee",fetch=FetchType.LAZY)
    private Collection<Eleve> eleves;
    @OneToMany(mappedBy="annee",fetch=FetchType.LAZY)
    private Collection<Bulletin> bulletins;
    @OneToMany(mappedBy="annee",fetch=FetchType.LAZY)
    private Collection<Inscription> inscriptions;
    @OneToMany(mappedBy="annee",fetch=FetchType.LAZY)
    private Collection<Absence> absences;
    @OneToMany(mappedBy="annee",fetch=FetchType.LAZY)
    private Collection<Note> notes;
    @OneToMany(mappedBy="annee",fetch=FetchType.LAZY)
    private Collection<Versement> versements;
    @OneToMany(mappedBy="annee",fetch=FetchType.LAZY)
    private Collection<Materiel> materiels;
    @OneToMany(mappedBy="annee",fetch=FetchType.LAZY)
    private Collection<Horaire> horaires;
    @OneToMany(mappedBy="annee",fetch=FetchType.LAZY)
    private Collection<Classe> classes;
    

    public AnneeScolaire() {
        super();
    }

    public AnneeScolaire(int id_annee, String libelle_annee) {
        super();
        this.id_annee = id_annee;
        this.libelle_annee = libelle_annee;
    }

    public int getId_annee() {
        return id_annee;
    }

    public void setId_annee(int id_annee) {
        this.id_annee = id_annee;
    }

    public String getLibelle_annee() {
        return libelle_annee;
    }

    public void setLibelle_annee(String libelle_annee) {
        this.libelle_annee = libelle_annee;
    }

    public Collection<Eleve> getEleves() {
        return eleves;
    }

    public void setEleves(Collection<Eleve> eleves) {
        this.eleves = eleves;
    }

    public Collection<Bulletin> getBulletins() {
        return bulletins;
    }

    public void setBulletins(Collection<Bulletin> bulletins) {
        this.bulletins = bulletins;
    }

    public Collection<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(Collection<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public Collection<Absence> getAbsences() {
        return absences;
    }

    public void setAbsences(Collection<Absence> absences) {
        this.absences = absences;
    }

    public Collection<Note> getNotes() {
        return notes;
    }

    public void setNotes(Collection<Note> notes) {
        this.notes = notes;
    }

    public Collection<Versement> getVersements() {
        return versements;
    }

    public void setVersements(Collection<Versement> versements) {
        this.versements = versements;
    }

    public Collection<Materiel> getMateriels() {
        return materiels;
    }

    public void setMateriels(Collection<Materiel> materiels) {
        this.materiels = materiels;
    }

    public Collection<Horaire> getHoraires() {
        return horaires;
    }

    public void setHoraires(Collection<Horaire> horaires) {
        this.horaires = horaires;
    }

    public Collection<Classe> getClasses() {
        return classes;
    }

    public void setClasses(Collection<Classe> classes) {
        this.classes = classes;
    }
    
    
}
