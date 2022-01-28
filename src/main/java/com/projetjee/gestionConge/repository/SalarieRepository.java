package com.projetjee.gestionConge.repository;

import com.projetjee.gestionConge.entities.Salarie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SalarieRepository extends JpaRepository<Salarie,Long> {

}
