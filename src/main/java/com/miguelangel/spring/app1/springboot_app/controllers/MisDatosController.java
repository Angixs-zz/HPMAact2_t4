package com.miguelangel.spring.app1.springboot_app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MisDatosController {

    @GetMapping("/mis_datos")
    public String mostrarDatos(Map<String, Object> datos) {

        datos.put("Nombre", "Miguel Angel");
        datos.put("Apellido", "Hernandez Perez");
        datos.put("Edad", 21);

        return "mis_datos";
    }
}