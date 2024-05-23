package com.pfe.monproj.Service;

import com.pfe.monproj.Entites.Admin;
import com.pfe.monproj.Entites.Problem;

import java.util.List;
import java.util.Optional;

public interface ProblemService {
    Problem ajouterProblem(Problem problem);
    Problem modifierProblem(Problem problem);
    List<Problem> affichierProblem();
    void supprimerProblem(Long id);
    Optional<Problem> afficherProblemById(Long id);
}
