package com.lavoz.service;

import com.lavoz.model.Noticias;
;

import java.util.List;
import java.util.Optional;


public interface INoticiasService {

    public List<Noticias>verNoticias();
    public Optional<Noticias> verNoticia(Long id);
    public void borrarNoticia(Long id);

    public void nuevaNoticia(Noticias noticia);
}
