package com.pfe.monproj.Repository;

import com.pfe.monproj.Entites.Actif;
import com.pfe.monproj.Entites.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActifRepostory extends JpaRepository<Actif,Long> {
}
