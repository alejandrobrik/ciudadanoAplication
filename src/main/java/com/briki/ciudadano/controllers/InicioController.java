package com.briki.ciudadano.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@Controller
public class InicioController {
    @GetMapping("/")
    public String inicio(){
        log.info("ejecutando el controlador Spring MVC");
        return "index";
    }

    @GetMapping("/agregar")
    public String modificar(){
        return  "modificar";
    }
}
