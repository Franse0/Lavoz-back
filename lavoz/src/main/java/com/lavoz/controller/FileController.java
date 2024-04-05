package com.lavoz.controller;

import com.lavoz.service.StorageService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

@RestController
@RequestMapping("media")
@AllArgsConstructor
public class FileController {
    private final StorageService storageService;
    private final HttpServletRequest request;


    @PostMapping("/upload")
    public Map<String, String> cargarArchivo(@RequestParam("file") MultipartFile multipartFile) {
        String path = storageService.storage(multipartFile);

        // Obtener el nombre del archivo cargado
        String nombreArchivo = multipartFile.getOriginalFilename();

        // Construir la URL completa incluyendo el nombre del archivo
        String url = ServletUriComponentsBuilder
                .fromCurrentContextPath()
                .path("/media/")  // Agregar la parte de la URL específica a tu aplicación
                .path(nombreArchivo) // Agregar el nombre del archivo a la URL
                .toUriString();

        return Map.of("url", url);
    }

    @GetMapping("{filename:.+}")
    public ResponseEntity<Resource> getFile(@PathVariable String filename) throws IOException {
        Resource file = storageService.loadResource(filename);
        String contentType = Files.probeContentType(file.getFile().toPath());

        return  ResponseEntity
                .ok()
                .header(HttpHeaders.CONTENT_TYPE, contentType)
                .body(file);
    }
}
