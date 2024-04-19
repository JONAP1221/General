package com.EjercicioPractico1.com.EjercicioPractico.dao;

import com.EjercicioPractico1.com.EjercicioPractico.domain.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroDao extends JpaRepository <Libro,Long> {
    
}