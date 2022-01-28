package com.projetjee.gestionConge.service;

import com.projetjee.gestionConge.entities.Groupe;

public interface GroupeService {
    Groupe addGroupe(Groupe groupe);
    void removeGroupe(Groupe groupe);
    Groupe updateGroupe(Groupe  groupe);
    Groupe getGroupeById(int id);
    
}
