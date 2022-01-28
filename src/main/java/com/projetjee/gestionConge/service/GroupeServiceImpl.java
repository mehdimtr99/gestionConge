package com.projetjee.gestionConge.service;

import com.projetjee.gestionConge.entities.Groupe;
import com.projetjee.gestionConge.repository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class GroupeServiceImpl implements IGroupeService{
    private final GroupeRepository groupeRepository;
    @Autowired
    public GroupeServiceImpl(GroupeRepository groupeRepository) {
        this.groupeRepository = groupeRepository;
    }

    @Override
    public Groupe addGroupe(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

    @Override
    public void removeGroupe(Groupe groupe) {
        groupeRepository.delete(groupe);
    }

    @Override
    public Groupe updateGroupe(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

    @Override
    public Groupe getGroupeById(Long id) {
        return groupeRepository.findById(id).get();
    }

    @Override
    public List<Groupe> listGroupe() {
        return groupeRepository.findAll();
    }
}
