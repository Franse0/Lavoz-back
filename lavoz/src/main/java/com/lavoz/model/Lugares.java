package com.lavoz.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "lugares")
@Getter @Setter
public class Lugares {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String telefono;
    private String ubicacion;
    @Column(length = 2500, columnDefinition = "TEXT")
    private String ubicacion_map;
    private String horario;
    private String img;
    private String ruta_img;
    private String ruta_img2;
    private String instagram;
    private String facebook;
    private String categoria;

    public Lugares() {
    }

    public Lugares(int id, String nombre, String telefono, String ubicacion, String ubicacion_map,
                   String horario, String img, String ruta_img, String ruta_img2,
                   String instagram, String facebook, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.ubicacion_map = ubicacion_map;
        this.horario = horario;
        this.img = img;
        this.ruta_img = ruta_img;
        this.ruta_img2 = ruta_img2;
        this.instagram = instagram;
        this.facebook = facebook;
        this.categoria = categoria;
    }
}
