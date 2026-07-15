package com.miguelangel.spring.app1.springboot_app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploRestController {

    @GetMapping("/Detalles_info2")
        public Map<String,Object> Detalles_info2(){
        Map<String,Object> respuesta = new HashMap<>();
        respuesta.put("Titulo","Servidor en Linea");
        respuesta.put("Servidor","MiguelAngel");
        respuesta.put("Ip","192.168.1.1");
        return respuesta;
    }

}
