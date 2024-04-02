package com.lavoz.service;

import  com.lavoz.model.Noticias;
import com.lavoz.respository.NoticiasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    public void nuevaNoticia(Noticias noticia) {
        noticiasRepo.save(noticia);
    }

/*
    @Override
    public void nuevaNoticia(String titulo, String cuerpo, String resumen, String fecha_publi,
                             String url_img, MultipartFile imagen, String categoria) {
        try {
            byte[] imagenBytes = imagen.getBytes(); // Obtener los bytes de la imagen
            Noticias noticia = new Noticias(titulo, cuerpo, resumen, fecha_publi, imagenBytes, url_img, categoria);
            noticiasRepo.save(noticia);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public byte[] obtenerBytesDeImagen(Long id) {
        // Lógica para obtener los bytes de la imagen de la noticia con el ID proporcionado
        Noticias noticia = noticiasRepo.findById(id).orElse(null);
        if (noticia != null) {
            return noticia.getImg();
        } else {
            return null;
        }
    }
*/
    public List<Noticias> buscarFiestasNombreUbicacion(@PathVariable String parametro){
        return noticiasRepo.buscarIgnoreCase(parametro);
    }
}