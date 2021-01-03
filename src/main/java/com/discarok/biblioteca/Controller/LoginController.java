package com.discarok.biblioteca.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String loginInicio(){
        return "login";
    }

    @RequestMapping("/")
    @ResponseBody
    public String inicio(){
        return "Esta sera la página de inicio";
    }
}