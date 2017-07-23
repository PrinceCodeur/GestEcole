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
public class Personnel implements Serializable {

    @Id
    @GeneratedValue
    private int id_personnel;
    @ManyToOne
    @JoinColumn(name = "id_type")
    private TypePersonnel typePersonnel;
    private String nomp;
    private String prenomp;
    private String tel;
    private String email;
    private Character sexe;
    @OneToMany(mappedBy="personnel",fetch=FetchType.LAZY)
    private Collection<Matiere> matieres;
    @OneToMany(mappedBy="personnel",fetch=FetchType.LAZY)
    private Collection<Horaire> horaires;

    public Personnel() {
        super();
    }

    public Personnel(TypePersonnel typePersonnel, String nomp, String prenomp, String tel, String email, Character sexe) {
        super();
        this.typePersonnel = typePersonnel;
        this.nomp = nomp;
        this.prenomp = prenomp;
        this.tel = tel;
        this.email = email;
        this.sexe = sexe;
    }

    public int getId_personnel() {
        return id_personnel;
    }

    public void setId_personnel(int id_personnel) {
        this.id_personnel = id_personnel;
    }

    public TypePersonnel getTypePersonnel() {
        return typePersonnel;
    }

    public void setTypePersonnel(TypePersonnel typePersonnel) {
        this.typePersonnel = typePersonnel;
    }

    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public String getPrenomp() {
        return prenomp;
    }

    public void setPrenomp(String prenomp) {
        this.prenomp = prenomp;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public Collection<Matiere> getMatieres() {
        return matieres;
    }

    public void setMatieres(Collection<Matiere> matieres) {
        this.matieres = matieres;
    }

    public Collection<Horaire> getHoraires() {
        return horaires;
    }

    public void setHoraires(Collection<Horaire> horaires) {
        this.horaires = horaires;
    }

}
