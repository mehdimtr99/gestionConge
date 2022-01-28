package com.projetjee.gestionConge.web;

import com.projetjee.gestionConge.entities.Conge;
import com.projetjee.gestionConge.service.ICongeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/conge")
public class CongeController {
    private final ICongeService iCongeService;

    public CongeController(ICongeService iCongeService) {
        this.iCongeService = iCongeService;
    }
    @PostMapping(path = "/add")
    public Conge addConge(@RequestBody Conge conge){
        return iCongeService.addConge(conge);
    }
    @PutMapping(path = "/update")
    public Conge updateConge(@RequestBody Conge conge){
        return iCongeService.updateConge(conge);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeConge(@PathVariable(name="id")Long id){
        iCongeService.removeConge(iCongeService.getCongeById(id));
    }
    @GetMapping(path="/listConge")
    public List<Conge> listConge(){
        return iCongeService.listConge();
    }
}
