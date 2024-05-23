package com.pfe.monproj.RestController;

import com.pfe.monproj.Entites.Actif;
import com.pfe.monproj.Entites.Problem;
import com.pfe.monproj.Repository.ProblemRespository;
import com.pfe.monproj.Service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/problem")
public class ProblemRestController {
    @Autowired
    ProblemRespository problemRespository;
    @Autowired
    ProblemService problemService;
    @RequestMapping(method = RequestMethod.POST)
    public Problem AjouterProblem(@RequestBody Problem problem){
        return problemService.ajouterProblem(problem);
    }
    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public Problem modifierProblem(@PathVariable("id")Long id, @RequestBody Problem problem){
        return problemService.modifierProblem(problem);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
    public void suppProblem(@PathVariable("id") Long id){
        problemService.supprimerProblem(id);

    }
    @RequestMapping(method = RequestMethod.GET )
    public List<Problem> afficherProblem(){
        return problemService.affichierProblem();

    }
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Optional<Problem> getProblemById(@PathVariable("id") Long id){

        Optional<Problem> problem = problemService.afficherProblemById(id);
        return problem;
    }

}
