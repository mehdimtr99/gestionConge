package com.projetjee.gestionConge.service;

import com.projetjee.gestionConge.entities.Conge;
import com.projetjee.gestionConge.repository.CongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class CongeServiceImpl implements ICongeService{
    private final CongeRepository congeRepository;
    @Autowired
    public CongeServiceImpl(CongeRepository congeRepository) {
        this.congeRepository = congeRepository;
    }

    @Override
    public Conge addConge(Conge conge) {
        return congeRepository.save(conge);
    }

    @Override
    public void removeConge(Conge conge) {
        congeRepository.delete(conge);
    }

    @Override
    public Conge updateConge(Conge conge) {
        return congeRepository.save(conge);
    }

    @Override
    public Conge getCongeById(Long id) {
        return congeRepository.findById(id).get();
    }

    @Override
    public List<Conge> listConge() {
        return congeRepository.findAll();
    }
}
