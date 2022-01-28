package com.projetjee.gestionConge.service;

import com.projetjee.gestionConge.entities.DemandeConge;
import com.projetjee.gestionConge.repository.DemandeCongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DemandeServiceImpl implements IDemandeService{
    private final DemandeCongeRepository demandeCongeRepository;
    @Autowired
    public DemandeServiceImpl(DemandeCongeRepository demandeCongeRepository) {
        this.demandeCongeRepository = demandeCongeRepository;
    }

    @Override
    public DemandeConge addDemandeConge(DemandeConge demandeConge) {
        return demandeCongeRepository.save(demandeConge);
    }

    @Override
    public void removeDemandeConge(DemandeConge demandeConge) {
        demandeCongeRepository.delete(demandeConge);
    }

    @Override
    public DemandeConge updateDemandeConge(DemandeConge demandeConge) {
        return demandeCongeRepository.save(demandeConge);
    }

    @Override
    public DemandeConge getDemandeCongeById(Long id) {
        return demandeCongeRepository.findById(id).get();
    }

    @Override
    public List<DemandeConge> listDemandeConge() {
        return demandeCongeRepository.findAll();
    }
}
