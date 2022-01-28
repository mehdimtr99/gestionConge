package com.projetjee.gestionConge.entities;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@Entity
public class Salarie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_salarie;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String login;
    private String password;
    private Integer solde;
    private LocalDate date_embauche;
    @Enumerated(EnumType.STRING)
    private Fonction fonction;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Groupe groupe;

    public Salarie(String nom, String prenom, String login, String password, Integer solde, LocalDate date_embauche, Fonction fonction, Groupe groupe) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.solde = solde;
        this.date_embauche = date_embauche;
        this.fonction = fonction;
        this.groupe = groupe;
    }

    @OneToMany(mappedBy = "salarie",fetch = FetchType.LAZY)
    private Collection<DemandeConge> demandeConges;

    public Salarie(String nom, String prenom, String login, String password, Integer solde, LocalDate date_embauche, Fonction fonction) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.solde = solde;
        this.date_embauche = date_embauche;
        this.fonction = fonction;
    }

    public Salarie() {
    }

    public Long getId_salarie() {
        return id_salarie;
    }

    public void setId_salarie(Long id_salarie) {
        this.id_salarie = id_salarie;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSolde() {
        return solde;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public LocalDate getDate_embauche() {
        return date_embauche;
    }

    public void setDate_embauche(LocalDate date_embauche) {
        this.date_embauche = date_embauche;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Collection<DemandeConge> getDemandeConges() {
        return demandeConges;
    }

    public void setDemandeConges(Collection<DemandeConge> demandeConges) {
        this.demandeConges = demandeConges;
    }
}
