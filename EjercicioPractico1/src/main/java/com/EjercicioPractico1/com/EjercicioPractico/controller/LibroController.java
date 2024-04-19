package com.EjercicioPractico1.com.EjercicioPractico.controller;

import com.EjercicioPractico1.com.EjercicioPractico.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j//es una parte de loombok, es oara que la vista entienda lo que se va a procesar, es un protocolo 
@RequestMapping("/libros")//Este es otro API
public class LibroController {
    
    @Autowired
    private LibroService LibroService;

    @GetMapping("/listado") //este es el API
    public String inicio(Model model) {
        var libro = LibroService.getLibro(false);//ese getCategorias se sacan los datos de la variable que se llamaba
        model.addAttribute("libros", libro);//el primero es el nombre que se le esta dando, es segundo es la variable 
        model.addAttribute("totallibros", libro.size());//.size le dice el tamaño que trae esa lista
        return "/libro/listado";
    }
}