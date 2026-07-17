package com.miguelangel.spring.app1.springboot_app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguelangel.spring.app1.springboot_app.models.dto.TacoDTO;

@RestController
@RequestMapping("/api/tacos")
public class TacoRestController {

    @PostMapping
    public TacoDTO recibirTaco(
            @RequestBody TacoDTO taco) {

        return taco;
    }
}
