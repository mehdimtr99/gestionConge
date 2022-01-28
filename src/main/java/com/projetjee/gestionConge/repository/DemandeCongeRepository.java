package com.projetjee.gestionConge.repository;

import com.projetjee.gestionConge.entities.DemandeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DemandeCongeRepository extends JpaRepository<DemandeConge,Long> {
}
