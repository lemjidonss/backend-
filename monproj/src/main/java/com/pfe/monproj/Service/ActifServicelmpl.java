package com.pfe.monproj.Service;

import com.pfe.monproj.Entites.Actif;
import com.pfe.monproj.Repository.ActifRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActifServicelmpl implements ActifService {
    @Autowired
    ActifRepostory actifRepository;

    @Override
    public Actif ajouterActif(Actif actif) {
        return actifRepository.save(actif);
    }

    @Override
    public Actif modifierActif(Actif actif) {
        return actifRepository.save(actif);
    }

    @Override
    public void supprimerActif(Long id) { actifRepository.deleteById(id);

    }

    @Override
    public List<Actif> affichierActif() {
       return actifRepository.findAll();}

    @Override
    public Optional<Actif> afficherActifById(Long id) {
        return actifRepository.findById(id);
    }
}
