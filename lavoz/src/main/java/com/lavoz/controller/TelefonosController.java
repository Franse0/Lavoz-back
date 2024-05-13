package com.lavoz.controller;

import com.lavoz.model.Telefonos;
import com.lavoz.service.TelefonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class TelefonosController {

    @Autowired
    public TelefonoService telefonoService;

    @GetMapping("/telefonos")
    @ResponseBody
    public List<Telefonos>telefonosVer(){
        return telefonoService.telefonosVer();
    }

    @GetMapping("telefonos/{id}")
    @ResponseBody
    public Optional<Telefonos>telefonoVer(@PathVariable Long id){
        return telefonoService.telefonoVer(id);
    }

    @PostMapping("/telefono/cargar")
    public void telefonoCargar(@RequestBody Telefonos telefonos){
        telefonoService.telefonoCargar(telefonos);
    }

    @DeleteMapping("/telefono/borrar/{id}")
    public void telefonoBorar(@PathVariable Long id){
        telefonoService.telefonobprrar(id);
    }

}
