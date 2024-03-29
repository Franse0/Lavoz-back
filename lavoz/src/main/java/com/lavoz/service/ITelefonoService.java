package com.lavoz.service;

import com.lavoz.model.Telefonos;


import java.util.List;
import java.util.Optional;

public interface ITelefonoService {

    public List<Telefonos> telefonosVer();
    public Optional<Telefonos>telefonoVer(Long id);
    public void  telefonoCargar(Telefonos telefono);
    public void telefonobprrar(Long id);
}
