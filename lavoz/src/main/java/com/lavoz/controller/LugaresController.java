package com.lavoz.controller;


import com.lavoz.model.Lugares;
import com.lavoz.service.LugaresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LugaresController {

    @Autowired
    public LugaresService lugaresService;

    @GetMapping("/lugares")
    @ResponseBody
    public List<Lugares>lugaresVer(){
        return lugaresService.lugaresVer();
    }

    @GetMapping("/lugares/{id}")
    @ResponseBody
    public Optional<Lugares>lugarVer(@PathVariable Long id){
        return lugaresService.lugarVer(id);
    }

    @PostMapping("/lugares/cargar")
    public void lugaresCargar(@RequestBody Lugares lugares){
        lugaresService.lugaresCargar(lugares);
    }

    @DeleteMapping("/lugares/borrar/{id}")
    public void lugaresBorrar(@PathVariable  Long id){
        lugaresService.lugaresBorrar(id);
    }
}
