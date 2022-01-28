package com.projetjee.gestionConge.web;

import com.projetjee.gestionConge.entities.Groupe;
import com.projetjee.gestionConge.service.IGroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/groupe")
public class GroupeController {

    private final IGroupeService iGroupeService;
    @Autowired
    public GroupeController(IGroupeService iGroupeService) {
        this.iGroupeService = iGroupeService;
    }

    @PostMapping(path = "/add")
    public Groupe addGroupe(@RequestBody Groupe groupe){
        return iGroupeService.addGroupe(groupe);
    }
    @PutMapping(path = "/update")
    public Groupe updateGroupe(@RequestBody Groupe groupe){
        return iGroupeService.updateGroupe(groupe);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeGroupe(@PathVariable(name="id")Long id){
        iGroupeService.removeGroupe(iGroupeService.getGroupeById(id));
    }
    @GetMapping(path="/listGroupe")
    public List<Groupe> listGroupe(){
        return iGroupeService.listGroupe();
    }
}
