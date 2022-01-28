package com.projetjee.gestionConge.web;

import com.projetjee.gestionConge.entities.Salarie;
import com.projetjee.gestionConge.service.ISalarieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/salarie")
public class SalarieController {
    private final ISalarieService iSalarieService;
    @Autowired
    public SalarieController(ISalarieService iSalarieService) {
        this.iSalarieService = iSalarieService;
    }
    @PostMapping(path = "/add")
    public Salarie addSalarie(@RequestBody Salarie salarie){
        return iSalarieService.addSalarie(salarie);
    }
    @PutMapping(path = "/update")
    public Salarie updateSalarie(@RequestBody Salarie salarie){
        return iSalarieService.updateSalarie(salarie);
    }
    @DeleteMapping(path = "/remove/{id}")
    public void removeSalarie(@PathVariable(name="id")Long id){
        iSalarieService.removeSalarie(iSalarieService.getSalarieById(id));
    }
    @GetMapping(path="/listSalarie")
    public String listSalarie(Model model){
        List<Salarie> listSalarie= iSalarieService.listSalarie();
        model.addAttribute("employes",listSalarie);
        return "employes";
    }
}
