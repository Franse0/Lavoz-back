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
    private String ubicacion_map;
    private String horario;
    private String img;
    private String ruta_img;
    private String instagram;
    private String facebook;

    public Lugares() {
    }

    public Lugares(int id, String nombre, String telefono, String ubicacion,
                   String ubicacion_map, String horario, String img,
                   String ruta_img, String instagram, String facebook) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.ubicacion_map = ubicacion_map;
        this.horario = horario;
        this.img = img;
        this.ruta_img = ruta_img;
        this.instagram = instagram;
        this.facebook = facebook;
    }
}
