package com.projetjee.gestionConge.entities;

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
    @OneToOne
    private DemandeConge demandeConge;
}
