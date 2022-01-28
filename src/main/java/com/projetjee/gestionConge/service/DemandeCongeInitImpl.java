package com.projetjee.gestionConge.service;

import com.projetjee.gestionConge.entities.*;
import com.projetjee.gestionConge.repository.CongeRepository;
import com.projetjee.gestionConge.repository.DemandeCongeRepository;
import com.projetjee.gestionConge.repository.GroupeRepository;
import com.projetjee.gestionConge.repository.SalarieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.Stream;

@Service
@Transactional
public class DemandeCongeInitImpl implements IdemandeCongeInit{
    @Autowired
    GroupeRepository groupeRepository;
    @Autowired
    SalarieRepository salarieRepository;
    @Autowired
    CongeRepository congeRepository;
    @Autowired
    DemandeCongeRepository demandeCongeRepository;
    @Override
    public void initGroupe() {
        Stream.of("admins","projet1","projet2","projet3","secretaria").forEach(groupeName->{
            Groupe groupe=new Groupe(groupeName);
            groupeRepository.save(groupe);
        });
    }

    @Override
    public void initSalarie() {

        groupeRepository.findAll().forEach(groupe-> {
            Fonction fonction;
            if (Objects.equals(groupe.getNom_groupe(), "admins")) {
                fonction=Fonction.responsableRh;
            }
            else {
                fonction=Fonction.standard;
            }
            Stream.of("emp1","emp2","emp3","emp4").forEach(salarieInfo->{
                Salarie salarie=new Salarie(salarieInfo,salarieInfo,salarieInfo+groupe.getNom_groupe()+"@gmail.com","password",10, LocalDate.now(), fonction,groupe);
                salarieRepository.save(salarie);

            });
            Stream.of("chefemp").forEach(salarieInfo->{
                Salarie salarie=new Salarie(salarieInfo,salarieInfo,salarieInfo+groupe.getNom_groupe()+"@gmail.com","password",10, LocalDate.now(), Fonction.chefProjet,groupe);
                salarieRepository.save(salarie);

            });
        });
    }

    @Override
    public void initConge() {
//        salarieRepository.findAll().forEach(salarie -> {
//            Conge conge=new Conge(LocalDate.now(),LocalDate.now(),"c'est conge de ");
//            congeRepository.save(conge);
//        });
    }

    @Override
    public void initDemande() {
      salarieRepository.findAll().forEach(salarie -> {
          Conge conge=new Conge(LocalDate.now(),LocalDate.now(),"c'est conge de ");
          congeRepository.save(conge);
          DemandeConge demandeConge=new DemandeConge(Date.from(Instant.now()),Etat.created,conge,salarie);
          demandeCongeRepository.save(demandeConge);
      });
    }
}
