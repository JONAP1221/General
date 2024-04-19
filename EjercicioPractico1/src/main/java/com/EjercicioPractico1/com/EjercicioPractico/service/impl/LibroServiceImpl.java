
package com.EjercicioPractico1.com.EjercicioPractico.service.impl;


import com.EjercicioPractico1.com.EjercicioPractico.dao.LibroDao;
import com.EjercicioPractico1.com.EjercicioPractico.domain.Libro;
import com.EjercicioPractico1.com.EjercicioPractico.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jonathan
 */

@Service
public class LibroServiceImpl implements LibroService {
    
    @Autowired//se conecta durectamente con este de abajo
    private LibroDao libroDao;

    @Override
    @Transactional(readOnly=true)//dimplemente se lee lo que hay en la base de datos
    public List<Libro> getLibro(boolean activos) {
        var lista=libroDao.findAll();//obtenemos todos los objetos de la categoria de la base de datos
        return lista;
    }
}
