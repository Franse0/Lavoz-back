package com.lavoz.service;

import com.lavoz.model.Lugares;


import java.util.List;
import java.util.Optional;

public interface ILugaresService {

    public List<Lugares>lugaresVer();
    public Optional<Lugares>lugarVer(Long id);
    public void lugaresBorrar(Long id);
    public void lugaresCargar(Lugares lugares);
}
