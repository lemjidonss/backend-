package com.pfe.monproj.Service;

import com.pfe.monproj.Entites.Problem;
import com.pfe.monproj.Entites.Ticket;


import java.util.List;
import java.util.Optional;

public interface TicketService {

    Ticket ajouterTicket(Ticket ticket);

    Ticket modifierTicket(Ticket ticket);

    void supprimerTicket(Long id);

    List<Ticket> affichierTicket();

    Optional<Ticket> afficherTicketById(Long id);
}
