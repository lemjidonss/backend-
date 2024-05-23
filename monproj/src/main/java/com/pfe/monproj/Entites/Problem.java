package com.pfe.monproj.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.engine.spi.Status;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String description;
    private String Status ;
    private Date  date_problem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Date getDate_problem() {
        return date_problem;
    }

    public void setDate_problem(Date date_problem) {
        this.date_problem = date_problem;
    }
}
