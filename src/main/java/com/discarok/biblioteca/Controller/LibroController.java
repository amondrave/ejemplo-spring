package com.discarok.biblioteca.Controller;

import com.discarok.biblioteca.Model.Libro;
import com.discarok.biblioteca.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
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
        model.addAttribute("libro",new Libro(
                0,"",new Date(),"",true
        ));
        return "libro/crear_libro";
    }

    @RequestMapping(value = "/crear-libro", method = RequestMethod.POST)
    public String createLibro(ModelMap model, @Valid @ModelAttribute("libro") Libro libro,
                              BindingResult result){
        if(result.hasErrors()){
            return "libro/crear_libro";
        }
        libroService.addLibro(libro);
        return "redirect:/administrar-libros";
    }

    @RequestMapping(value = "/borrar-libro" , method = RequestMethod.GET)
    public String  deleteLibro(@RequestParam int codigo){
        libroService.deleteLibro(codigo);
        return "redirect:/administrar-libros";
    }

}
