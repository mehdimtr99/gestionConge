package com.projetjee.gestionConge.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
public class DemandeConge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_demande;
    private Date date_creation;
    @Enumerated(EnumType.STRING)
    private Etat etat;
    @OneToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Conge conge;
    @ManyToOne()
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Salarie salarie;

    public DemandeConge() {
    }

    public DemandeConge(Date date_creation, Etat etat, Conge conge, Salarie salarie) {
        this.date_creation = date_creation;
        this.etat = etat;
        this.conge = conge;
        this.salarie = salarie;
    }

    public Long getId_demande() {
        return id_demande;
    }

    public void setId_demande(Long id_demande) {
        this.id_demande = id_demande;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Conge getConge() {
        return conge;
    }

    public void setConge(Conge conge) {
        this.conge = conge;
    }

    public Salarie getSalarie() {
        return salarie;
    }

    public void setSalarie(Salarie salarie) {
        this.salarie = salarie;
    }
}
