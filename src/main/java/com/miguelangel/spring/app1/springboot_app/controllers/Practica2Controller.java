//ejemplocontroller = este archivo

package com.miguelangel.spring.app1.springboot_app.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.miguelangel.spring.app1.springboot_app.models.Taco;

@Controller
public class Practica2Controller {

    @GetMapping("/practica2_info")
        public String info(Model model){
        Taco taco1 = new Taco("TacoPastor", "Cerdo", "Harina", "Roja", 12, 1, 001);
        model.addAttribute("Taco", taco1);
        return "practica2_info";
    }


@ModelAttribute("ListaTacos")
    public List<Taco> listaTacos() {

        return Arrays.asList(
            new Taco(
                "TacoPastor",
                "Cerdo",
                "Harina",
                "Roja",
                12,
                1,
                1
            ),
            new Taco(
                "TacoAsada",
                "Res",
                "Maiz",
                "Verde",
                18,
                2,
                2
            ),
            new Taco(
                "TacoChorizo",
                "Cerdo",
                "Maiz",
                null,
                15,
                3,
                3
            )
        );
    }
 
}
