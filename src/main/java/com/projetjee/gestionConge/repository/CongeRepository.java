package com.projetjee.gestionConge.repository;

import com.projetjee.gestionConge.entities.Conge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CongeRepository extends JpaRepository<Conge,Long> {
}
