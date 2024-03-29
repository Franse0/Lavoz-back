package com.lavoz.service;

import com.lavoz.model.Lugares;
import com.lavoz.respository.LugaresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LugaresService implements ILugaresService{


    @Autowired
    private LugaresRepository lugaresRepository;
    @Override
    public List<Lugares> lugaresVer() {
        return lugaresRepository.findAll();
    }

    @Override
    public Optional<Lugares> lugarVer(Long id) {
        return lugaresRepository.findById(id);
    }

    @Override
    public void lugaresBorrar(Long id) {
        lugaresRepository.deleteById(id);
    }

    @Override
    public void lugaresCargar(Lugares lugares) {
        lugaresRepository.save(lugares);
    }
}
