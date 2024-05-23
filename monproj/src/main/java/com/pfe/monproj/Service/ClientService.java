package com.pfe.monproj.Service;

import com.pfe.monproj.Entites.Admin;
import com.pfe.monproj.Entites.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    List<Client> affichierClient();
    void supprimerClient(Long id);
    Optional<Client> afficherClientById(Long id);
}
