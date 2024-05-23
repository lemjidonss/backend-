package com.pfe.monproj.Service;

import com.pfe.monproj.Entites.Actif;

import java.util.List;
import java.util.Optional;

public interface ActifService {
    Actif ajouterActif(Actif actif);

    Actif modifierActif(Actif actif);

    void supprimerActif(Long id);

    List<Actif> affichierActif();

    Optional<Actif> afficherActifById(Long id);
}
