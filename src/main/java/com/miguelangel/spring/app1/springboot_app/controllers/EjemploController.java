package com.miguelangel.spring.app1.springboot_app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/Detalles_info")

    
    /*public String info(Model model){
        model.addAttribute("Titulo","Servidor en Linea");
        model.addAttribute("Servidor","MiguelAngel");
        model.addAttribute("Ip","192.168.1.1");
        return "Detalles_info";
    }*/

        public String info(Map<String,Object> modelo){
        modelo.put("Titulo","Servidor en Linea");
        modelo.put("Servidor","MiguelAngel");
        modelo.put("Ip","192.168.1.1");
        return "Detalles_info";
    }

}
