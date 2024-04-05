package com.lavoz.service;

import  com.lavoz.model.Noticias;
import com.lavoz.respository.NoticiasRepository;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class NoticiasService implements INoticiasService {

    @Autowired
    public NoticiasRepository noticiasRepo;
    @Override
    public List<Noticias> verNoticias() {
        return noticiasRepo.findAll();
    }

    @Override
    public Optional<Noticias> verNoticia(Long id) {
        return noticiasRepo.findById(id);
    }

    @Override
    public void borrarNoticia(Long id) {
        noticiasRepo.deleteById(id);
    }



    @Override
    public void  nuevaNoticia(Noticias noticias) {
        noticiasRepo.save(noticias);
    }

    public List<Noticias> bucarNoticias(@PathVariable String parametro){
        return noticiasRepo.buscarIgnoreCase(parametro);
    }
}