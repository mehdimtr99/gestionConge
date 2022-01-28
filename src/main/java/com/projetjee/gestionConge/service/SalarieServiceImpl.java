package com.projetjee.gestionConge.service;

import com.projetjee.gestionConge.entities.Salarie;
import com.projetjee.gestionConge.repository.SalarieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SalarieServiceImpl implements ISalarieService{
    private final SalarieRepository salarieRepository;
    @Autowired
    public SalarieServiceImpl(SalarieRepository salarieRepository) {
        this.salarieRepository = salarieRepository;
    }

    @Override
    public Salarie addSalarie(Salarie salarie) {
        return salarieRepository.save(salarie);
    }

    @Override
    public void removeSalarie(Salarie salarie) {
        salarieRepository.delete(salarie);
    }

    @Override
    public Salarie updateSalarie(Salarie salarie) {
        return salarieRepository.save(salarie);
    }

    @Override
    public Salarie getSalarieById(Long id) {
        return salarieRepository.findById(id).get();
    }

    @Override
    public List<Salarie> listSalarie() {
        return salarieRepository.findAll();
    }
}
