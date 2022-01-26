package com.projetjee.gestionConge.repository;

import com.projetjee.gestionConge.entities.DemandeConge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeCongeRepository extends JpaRepository<DemandeConge,Long> {
}
