package com.pfe.monproj.RestController;

import com.pfe.monproj.Entites.Actif;
import com.pfe.monproj.Entites.Problem;
import com.pfe.monproj.Repository.ActifRepostory;
import com.pfe.monproj.Service.ActifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/actif")
public class ActifRestController{
    @Autowired
    ActifRepostory actifRepostory;
    @Autowired
    ActifService actifService;
    @RequestMapping(method = RequestMethod.POST)
    public Actif AjouterActif(@RequestBody Actif actif){
        return actifService.ajouterActif(actif);
}
    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public Actif modifierActif(@PathVariable("id")Long id, @RequestBody Actif actif){
        return actifService.modifierActif(actif);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
    public void suppActif(@PathVariable("id") Long id){
        actifService.supprimerActif(id);

    }
    @RequestMapping(method = RequestMethod.GET )
    public List<Actif> afficherActif(){
        return actifService.affichierActif();

    }
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Optional<Actif> getActifById(@PathVariable("id") Long id){

        Optional<Actif> actif = actifService.afficherActifById(id);
        return actif;
    }
}
