package com.discarok.biblioteca.Service;


import org.springframework.stereotype.Component;


/**
 * @author discarok
 * @version 1.0.0
 * Clase que nos proporcionara el servicio del login
 */

// Volvemos componente nuestra clase para poder aplicar inyección de dependencias
@Component
public class LoginService {

    /**
     * Metodo para validar usuario y contraseña para logueo
     * para este caso validaremos con datos quemados
     * @return true si los datos ingresados corresponden con lo previsto
     */
     public boolean validarUsuario(String nombre, String contrasena){
         // nombre = angel , contrasena = discarok
         if (nombre.equalsIgnoreCase("angel") && contrasena.equalsIgnoreCase("discarok")){
             return true;
         }
         return false;
     }

}
