package com.projetjee.gestionConge;

import com.projetjee.gestionConge.entities.Fonction;
import com.projetjee.gestionConge.entities.Groupe;
import com.projetjee.gestionConge.entities.Salarie;
import com.projetjee.gestionConge.repository.GroupeRepository;
import com.projetjee.gestionConge.repository.SalarieRepository;
import com.projetjee.gestionConge.service.IdemandeCongeInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GestionCongeApplication implements CommandLineRunner {
//	@Autowired
//	private GroupeRepository groupeRepository;
//	@Autowired
//	private SalarieRepository salarieRepository;
	@Autowired
	private IdemandeCongeInit idemandeCongeInit;
	public static void main(String[] args) {
		SpringApplication.run(GestionCongeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//	Groupe c=groupeRepository.save(new Groupe("grp1"));
//		salarieRepository.save(
//				new Salarie(
//						"mehdi",
//						"mathor",
//						"mehdimathor99@gmail.com",
//						"password",
//						22,
//						LocalDate.now(),
//						Fonction.standard,
//						c
//				)
//		);
		idemandeCongeInit.initGroupe();
		idemandeCongeInit.initSalarie();

	}
}
