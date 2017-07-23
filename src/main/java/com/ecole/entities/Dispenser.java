package com.ecole.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dispenser implements Serializable {
    
    @Id
    @GeneratedValue
    private int idclassematiere;
    @ManyToOne
    @JoinColumn(name = "id_matiere")
    private Matiere matiere;
    @ManyToOne
    @JoinColumn(name = "id_classe")
    private Classe classe;

    public Dispenser() {
        super();
    }

    public Dispenser(Matiere matiere, Classe classe) {
        super();
        this.matiere = matiere;
        this.classe = classe;
    }

    public int getIdclassematiere() {
        return idclassematiere;
    }

    public void setIdclassematiere(int idclassematiere) {
        this.idclassematiere = idclassematiere;
    }

    public Matiere getId_matiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
    
}
