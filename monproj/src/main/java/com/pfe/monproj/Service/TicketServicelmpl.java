package com.pfe.monproj.Service;

import com.pfe.monproj.Entites.Problem;
import com.pfe.monproj.Entites.Ticket;
import com.pfe.monproj.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServicelmpl implements TicketService{
    @Autowired
    TicketRepository ticketRepository;


    @Override
    public Ticket ajouterTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket modifierTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void supprimerTicket(Long id) {
        ticketRepository.deleteById(id);

    }

    @Override
    public List<Ticket> affichierTicket() {
        return ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> afficherTicketById(Long id) {
        return ticketRepository.findById(id);
    }
}
