package com.projetjee.gestionConge.service;

import com.projetjee.gestionConge.entities.Salarie;

import java.util.List;
import java.util.Optional;

public interface ISalarieService {
    Salarie addSalarie(Salarie salarie);
    void removeSalarie(Salarie salarie);
    Salarie updateSalarie(Salarie  salarie);
    Salarie getSalarieById(Long id);
    List<Salarie> listSalarie();
//    Salarie addDemandeCongeToSalarie(int idSalarie, int IdDemandeConge);
}
