package com.EjercicioPractico1.com.EjercicioPractico.service;

import com.EjercicioPractico1.com.EjercicioPractico.domain.Libro;
import java.util.List;

public interface LibroService {
    
    // Se obtiene un listado de categorias en un List
    public List<Libro> getLibro(boolean activos);
 
}