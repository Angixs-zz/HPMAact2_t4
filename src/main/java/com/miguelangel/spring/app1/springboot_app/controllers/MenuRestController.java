package com.miguelangel.spring.app1.springboot_app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuRestController {

    @GetMapping("/menu_tacos")
    public Map<String, Object> menuTacos() {

        Map<String, Object> respuesta = new HashMap<>();

        respuesta.put("Taco1", "Taco al pastor");
        respuesta.put("Precio1", 18);

        respuesta.put("Taco2", "Taco de asada");
        respuesta.put("Precio2", 22);

        respuesta.put("Taco3", "Taco de chorizo");
        respuesta.put("Precio3", 20);

        return respuesta;
    }

    @GetMapping("/tacos_promo")
    public int precioPromocion() {
        return 80; 
        //aqui tenia hambre y vi una promo de 10 tacos por 80 pesos
    }
}