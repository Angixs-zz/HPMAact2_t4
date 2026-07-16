package com.miguelangel.spring.app1.springboot_app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguelangel.spring.app1.springboot_app.models.Taco;

@RestController
@RequestMapping("/api")




public class MenuRestController {

    @GetMapping(path = "/menu_tacos")
    public Map<String, Object> menuTacos() {
        
        Taco taco1 = new Taco("TacoPastor", "Cerdo", "Harina", "Roja", 12, 1, 001);




        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Tacos", "Datos Tacos");
        respuesta.put("Informacion", taco1);

        return respuesta;
    }

    @GetMapping("/tacos_promo")
    public int precioPromocion() {
        return 80; 
        //aqui tenia hambre y vi una promo de 10 tacos por 80 pesos
    }
}