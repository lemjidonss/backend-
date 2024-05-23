package com.pfe.monproj.Repository;

import com.pfe.monproj.Entites.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
