package com.discarok.biblioteca.Service;

import com.discarok.biblioteca.Model.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author discarok
 * @version 1.0.0
 * Servicios del libro
 */

@Service
public class LibroService {

    private List<Libro> libros = new ArrayList<Libro>(Arrays.asList(
            new Libro(1,"Robinson crusoe",new Date(1719,10,23),"EN",true),
            new Libro(2,"Dracula",new Date(1897,3,26),"EN",true),
            new Libro(3,"La hojarasca",new Date(1955,5,12),"ES",true)
    ));

    public void addLibro(int codigo, String nombre, Date fecha, String lenguaje){
         libros.add(new Libro(codigo,nombre,fecha,lenguaje,true));
    }

    public void deleteLibro(int codigo){
       libros.removeIf(libro -> (libro.getCodigo() == codigo));
    }

    public List<Libro> findAllLibros(){
        return this.libros;
    }

    public Libro getLibro(int codigo){
        return libros.stream().filter(libro -> (libro.getCodigo() == codigo)).findFirst().get();
    }

    public Libro getLibroByName(String nombre){
        nombre.toLowerCase();
        return libros.stream().filter(libro -> (libro.getNombre().equalsIgnoreCase(nombre))
        ).findFirst().get();
    }

    public Date castingDate(String fecha){
        String aux [] = fecha.split("-");
        int anio = Integer.parseInt(aux[0]);
        int mes  = Integer.parseInt(aux[1]);
        int dia  = Integer.parseInt(aux[2]);
        return new Date(anio,mes,dia);
    }

}
