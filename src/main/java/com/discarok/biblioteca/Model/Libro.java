package com.discarok.biblioteca.Model;

import java.util.Date;
import java.util.Objects;

/**
 * @author discarok
 * @version  1.0.0
 * Clase que representa el modelo de un libro
 */

public class Libro {

    private int codigo;
    private String nombre;
    private Date fechaIngreso;
    private String lenguaje;
    private boolean disponible;


    public Libro(int codigo, String nombre, Date fechaIngreso, String lenguaje, boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.lenguaje = lenguaje;
        this.disponible = disponible;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    @Override
    public String toString(){
        return this.codigo + " " + this.nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return codigo == libro.codigo && disponible == libro.disponible && Objects.equals(nombre, libro.nombre) && Objects.equals(fechaIngreso, libro.fechaIngreso) && Objects.equals(lenguaje, libro.lenguaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, fechaIngreso, lenguaje, disponible);
    }
}
