package com.discarok.biblioteca.Controller;

import com.discarok.biblioteca.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @author discarok
 * @version 1.0.0
 */

@Controller
public class LibroController {
    @Autowired
    LibroService libroService;

    @RequestMapping(value = "/administrar-libros", method = RequestMethod.GET)
    public String showManageLibro(ModelMap model){
        model.put("titulo","Lista de libros");
        model.put("libros",libroService.findAllLibros());
        return "libro/libros";
    }

    @RequestMapping(value = "/crear-libro",method = RequestMethod.GET)
    public String showAddLibroPage(ModelMap model){
        model.put("titulo","Crear libro");

        return "libro/crear_libro";
    }

    @RequestMapping(value = "/crear-libro", method = RequestMethod.POST)
    public String createLibro(ModelMap model, @RequestParam int codigo, @RequestParam String nombre,
                              @RequestParam String fecha, @RequestParam String lenguaje){
        Date fechaPublicacion = libroService.castingDate(fecha);
        libroService.addLibro(codigo, nombre,fechaPublicacion, lenguaje);
        return "redirect:/administrar-libros";
    }
}
