package com.discarok.biblioteca.Controller;

import com.discarok.biblioteca.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    // Anotación  que me permite determinar que es un servicio
    @Autowired
    LoginService servicio;

    // ModelMap es una clase de mapa que me permite en el MVC enviar datos a mi vista
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String muestraLogin( ModelMap modelo){
        return "login";
    }

   @RequestMapping(value = "/login", method = RequestMethod.POST)
    public  String iniciaSesion(ModelMap modelo, @RequestParam String nombre,@RequestParam String contrasena){
        boolean usuarioValido = servicio.validarUsuario(nombre,contrasena);
        modelo.put("nombre",nombre);
        if (!usuarioValido) {
            modelo.put("mensaje","Las credenciales no coinciden");
            return "login";
        }
        return "inicio";
   }
}
