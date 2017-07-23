package com.ecole.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Enseigner implements Serializable {
    @Id
    @GeneratedValue
    private int idmatiereperso;
    @ManyToOne
    @JoinColumn(name = "id_personnel")
    private Personnel personnel;
    @ManyToOne
    @JoinColumn(name = "id_matiere")
    private Matiere matiere;

    public Enseigner() {
        super();
    }

    public Enseigner(Personnel personnel, Matiere matiere) {
        super();
        this.personnel = personnel;
        this.matiere = matiere;
    }

    public int getIdmatiereperso() {
        return idmatiereperso;
    }

    public void setIdmatiereperso(int idmatiereperso) {
        this.idmatiereperso = idmatiereperso;
    }

    public Personnel getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Personnel personnel) {
        this.personnel = personnel;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
    
}
