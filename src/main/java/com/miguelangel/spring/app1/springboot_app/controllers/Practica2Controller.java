package com.miguelangel.spring.app1.springboot_app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.miguelangel.spring.app1.springboot_app.models.Taco;
import com.miguelangel.spring.app1.springboot_app.models.dto.TacoDTO;

@Controller
public class Practica2Controller {

    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.mensaje}")
    private String mensaje;

    @GetMapping("/practica2_info")
    public String info(
            @RequestParam(required = false) String carne,
            Model model) {

        Taco taco1 = new Taco("TacoPastor", "Cerdo", "Harina", "Roja", 12, 1, 1);

        List<Taco> listaCompleta = Arrays.asList(
                new Taco("TacoPastor", "Cerdo", "Harina", "Roja", 12, 1, 1),
                new Taco("TacoAsada", "Res", "Maiz", "Verde", 18, 2, 2),
                new Taco("TacoChorizo", "Cerdo", "Maiz", null, 15, 3, 3));

        List<Taco> listaFiltrada;

        if (carne == null || carne.isBlank()) {
            listaFiltrada = listaCompleta;
        } else {
            listaFiltrada = listaCompleta.stream()
                    .filter(taco -> taco.getTipoCarne().equalsIgnoreCase(carne))
                    .toList();
        }

        model.addAttribute("Titulo", "Información y lista de tacos");
        model.addAttribute("Taco", taco1);
        model.addAttribute("ListaTacos", listaFiltrada);
        model.addAttribute("carneSeleccionada", carne);
        model.addAttribute("Usuario", usuario);
        model.addAttribute("Mensaje", mensaje);

        return "practica2_info";
    }

    @GetMapping("/tacos/formulario")
    public String mostrarFormulario(Model model) {

        model.addAttribute("taco", new TacoDTO());

        return "formulario_taco";
    }

    @PostMapping("/tacos/guardar")
    public String guardarTaco(
            @ModelAttribute("taco") TacoDTO taco,
            Model model) {

        model.addAttribute("tacoGuardado", taco);

        return "formulario_taco";
    }

    @GetMapping("/tacos/detalle/{id}")
    public String detalleTaco(
            @PathVariable int id,
            Model model) {

        List<Taco> listaTacos = Arrays.asList(
            new Taco("TacoPastor", "Cerdo", "Harina", "Roja", 12, 1, 1),
            new Taco("TacoAsada", "Res", "Maiz", "Verde", 18, 2, 2),
            new Taco("TacoChorizo", "Cerdo", "Maiz", null, 15, 3, 3)
        );

        Taco tacoEncontrado = listaTacos.stream()
                .filter(taco -> taco.getId() == id)
                .findFirst()
                .orElse(null);

        model.addAttribute("tacoDetalle", tacoEncontrado);
        model.addAttribute("idBuscado", id);

        return "detalle_taco";
    }
}