package com.projetjee.gestionConge.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
public class Conge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_conge;
    private LocalDate date_debut,date_fin;
    private String motif;
    @OneToOne(mappedBy = "conge")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private DemandeConge demandeConge;

    public Long getId_conge() {
        return id_conge;
    }

    public void setId_conge(Long id_conge) {
        this.id_conge = id_conge;
    }

    public LocalDate getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(LocalDate date_debut) {
        this.date_debut = date_debut;
    }

    public LocalDate getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(LocalDate date_fin) {
        this.date_fin = date_fin;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public DemandeConge getDemandeConge() {
        return demandeConge;
    }

    public void setDemandeConge(DemandeConge demandeConge) {
        this.demandeConge = demandeConge;
    }

    public Conge() {
    }

    public Conge(LocalDate date_debut, LocalDate date_fin, String motif) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.motif = motif;
    }
}
