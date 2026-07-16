//ejemplocontroller = este archivo

package com.miguelangel.spring.app1.springboot_app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.miguelangel.spring.app1.springboot_app.models.Taco;

@Controller
public class Practica2Controller {

    @GetMapping("/practica2_info")
        public String info(Model model){
        Taco taco1 = new Taco("TacoPastor", "Cerdo", "Harina", "Roja", 12, 1, 001);
        model.addAttribute("Empleado", taco1);
        return "practica2_info";
    }

}
