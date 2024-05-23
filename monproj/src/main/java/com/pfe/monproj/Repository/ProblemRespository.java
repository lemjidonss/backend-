package com.pfe.monproj.Repository;

import com.pfe.monproj.Entites.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProblemRespository extends JpaRepository<Problem,Long> {
}
