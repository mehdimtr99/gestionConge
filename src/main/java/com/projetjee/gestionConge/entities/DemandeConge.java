package com.projetjee.gestionConge.entities;

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
    private Conge conge;
    @ManyToOne()
    private Salarie salarie;
}
