package com.ecole.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trimestre implements Serializable {

    @Id
    @GeneratedValue
    private int id_trimestre;
    private String libelle_trimestre;
    @OneToMany(mappedBy="trimestre",fetch=FetchType.LAZY)
    private Collection<Bulletin> bulletins;
    @OneToMany(mappedBy="trimestre",fetch=FetchType.LAZY)
    private Collection<Note> notes;

    public Trimestre() {
        super();
    }

    public Trimestre(String libelle_trimestre) {
        super();
        this.libelle_trimestre = libelle_trimestre;
    }

    public int getId_trimestre() {
        return id_trimestre;
    }

    public void setId_trimestre(int id_trimestre) {
        this.id_trimestre = id_trimestre;
    }

    public String getLibelle_trimestre() {
        return libelle_trimestre;
    }

    public void setLibelle_trimestre(String libelle_trimestre) {
        this.libelle_trimestre = libelle_trimestre;
    }

    public Collection<Bulletin> getBulletins() {
        return bulletins;
    }

    public void setBulletins(Collection<Bulletin> bulletins) {
        this.bulletins = bulletins;
    }

    public Collection<Note> getNotes() {
        return notes;
    }

    public void setNotes(Collection<Note> notes) {
        this.notes = notes;
    }
    
}
