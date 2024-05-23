package com.pfe.monproj.Repository;

import com.pfe.monproj.Entites.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
    boolean existsByEmail(String email);

    Admin findAdminByEmail(String email);
}
