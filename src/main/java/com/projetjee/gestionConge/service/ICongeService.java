package com.projetjee.gestionConge.service;

import com.projetjee.gestionConge.entities.Conge;

import java.util.List;

public interface ICongeService {
    Conge addConge(Conge conge);
    void removeConge(Conge conge);
    Conge updateConge(Conge conge);
    Conge getCongeById(Long id);
    List<Conge> listConge();
}
