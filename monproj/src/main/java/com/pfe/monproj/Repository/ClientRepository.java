package com.pfe.monproj.Repository;


import com.pfe.monproj.Entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findClientByEmail(String email);

    boolean existsByEmail(String email);
}
