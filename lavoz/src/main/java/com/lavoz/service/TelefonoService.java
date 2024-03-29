package com.lavoz.service;

import com.lavoz.model.Telefonos;
import com.lavoz.respository.TelefonosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelefonoService  implements ITelefonoService {

    @Autowired
    private TelefonosRepository telefonosRepository;
    @Override
    public List<Telefonos> telefonosVer() {
        return telefonosRepository.findAll();
    }

    @Override
    public Optional<Telefonos> telefonoVer(Long id) {
        return telefonosRepository.findById(id);
    }

    @Override
    public void telefonoCargar(Telefonos telefono) {
        telefonosRepository.save(telefono);
    }

    @Override
    public void telefonobprrar(Long id) {
        telefonosRepository.deleteById(id);
    }
}
