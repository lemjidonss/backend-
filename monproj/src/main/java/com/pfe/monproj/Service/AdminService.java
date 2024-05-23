package com.pfe.monproj.Service;

import com.pfe.monproj.Entites.Admin;

import java.util.List;
import java.util.Optional;

public interface AdminService {
    Admin ajouterAdmin(Admin admin);
    Admin modifierAdmin(Admin admin);
    List<Admin> affichierAdmin();
    void supprimerAdmin(Long id);
    Optional<Admin>afficherAdminById(Long id);
}
