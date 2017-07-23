package com.ecole.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.*;

@Entity
public class Eleve implements Serializable {
    
    @Id
    @GeneratedValue
    private int id_eleve;
    @ManyToOne
    @JoinColumn(name = "id_classe")
    private Classe classe;
    private String matricule;
    private String nom;
    private String prenom;
//    @Temporal(value=)
    private Date date_naiss;
    private String lieu_naiss;
    private Character sexe;
    private String classe_redoubler;
    @OneToMany(mappedBy="eleve",fetch=FetchType.LAZY)
    private Collection<Bulletin> bulletins;
    @OneToMany(mappedBy="eleve",fetch=FetchType.LAZY)
    private Collection<Versement> versements;
    @OneToMany(mappedBy="eleve",fetch=FetchType.LAZY)
    private Collection<Absence> absence;
    @OneToMany(mappedBy="eleve",fetch=FetchType.LAZY)
    private Collection<Matiere> matieres;


    public Eleve() {
        super();
    }

    public Eleve(Classe classe, String matricule, String nom, String prenom, Date date_naiss, String lieu_naiss, Character sexe, String classe_redoubler) {
        super();
        this.classe = classe;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.lieu_naiss = lieu_naiss;
        this.sexe = sexe;
        this.classe_redoubler = classe_redoubler;
    }
    
    public int getId_eleve() {
        return id_eleve;
    }

    public void setId_eleve(int id_eleve) {
        this.id_eleve = id_eleve;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe id_classe) {
        this.classe = classe;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(Date date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getLieu_naiss() {
        return lieu_naiss;
    }

    public void setLieu_naiss(String lieu_naiss) {
        this.lieu_naiss = lieu_naiss;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public String getClasse_redoubler() {
        return classe_redoubler;
    }

    public void setClasse_redoubler(String classe_redoubler) {
        this.classe_redoubler = classe_redoubler;
    }

    public Collection<Bulletin> getBulletins() {
        return bulletins;
    }

    public void setBulletins(Collection<Bulletin> bulletins) {
        this.bulletins = bulletins;
    }

    public Collection<Versement> getVersements() {
        return versements;
    }

    public void setVersements(Collection<Versement> versements) {
        this.versements = versements;
    }

    public Collection<Absence> getAbsence() {
        return absence;
    }

    public void setAbsence(Collection<Absence> absence) {
        this.absence = absence;
    }

    public Collection<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(Collection<Matiere> matieres) {
        this.matieres = matieres;
    }
    
    
}
