package com.pfe.monproj.RestController;

import com.pfe.monproj.Entites.Actif;
import com.pfe.monproj.Entites.Problem;
import com.pfe.monproj.Entites.Ticket;
import com.pfe.monproj.Repository.TicketRepository;
import com.pfe.monproj.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/ticket")
public class TicketRestController {
    @Autowired
    TicketRepository ticketRepository;
    @Autowired
    TicketService ticketService;
    @RequestMapping(method = RequestMethod.POST)
    public Ticket AjouterTicket(@RequestBody Ticket ticket){
        return ticketService.ajouterTicket(ticket);
    }
    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public Ticket modifierticket(@PathVariable("id")Long id, @RequestBody Ticket ticket){
        return ticketService.modifierTicket(ticket);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE )
    public void suppTicket(@PathVariable("id") Long id){
        ticketService.supprimerTicket(id);

    }
    @RequestMapping(method = RequestMethod.GET )
    public List<Ticket> afficherTicket(){
        return ticketService.affichierTicket();

    }
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Optional<Ticket> getTicketById(@PathVariable("id") Long id){

        Optional<Ticket> ticket = ticketService.afficherTicketById(id);
        return ticket;
    }
}
