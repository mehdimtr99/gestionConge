package com.projetjee.gestionConge.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Groupe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_groupe;
    private String nom_groupe;
    @OneToMany(mappedBy = "groupe",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Salarie> salaries;

    public Groupe() {
    }

    public Long getId_groupe() {
        return id_groupe;
    }

    public void setId_groupe(Long id_groupe) {
        this.id_groupe = id_groupe;
    }

    public String getNom_groupe() {
        return nom_groupe;
    }

    public void setNom_groupe(String nom_groupe) {
        this.nom_groupe = nom_groupe;
    }

    public Collection<Salarie> getSalaries() {
        return salaries;
    }

    public void setSalaries(Collection<Salarie> salaries) {
        this.salaries = salaries;
    }

    public Groupe(String nom_groupe) {
        this.nom_groupe = nom_groupe;
    }
}
