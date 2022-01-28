package com.projetjee.gestionConge.repository;

import com.projetjee.gestionConge.entities.Conge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CongeRepository extends JpaRepository<Conge,Long> {
}
