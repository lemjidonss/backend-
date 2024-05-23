package com.pfe.monproj.Service;

import com.pfe.monproj.Entites.Admin;
import com.pfe.monproj.Entites.Problem;
import com.pfe.monproj.Repository.AdminRepository;
import com.pfe.monproj.Repository.ProblemRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProblemServicelmpl implements ProblemService{
    @Autowired
    ProblemRespository problemRepository;

    @Override
    public Problem ajouterProblem(Problem problem) {
        return problemRepository.save(problem);
    }

    @Override
    public Problem modifierProblem(Problem problem) {
        return problemRepository.save(problem);
    }

    @Override
    public List<Problem> affichierProblem() {
        return problemRepository.findAll();
    }

    @Override
    public void supprimerProblem(Long id) {
        problemRepository.deleteById(id);

    }

@Override
    public Optional<Problem> afficherProblemById(Long id) {
        return problemRepository.findById(id);
    }
}
