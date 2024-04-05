package com.lavoz.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "telefonos")
@Getter @Setter
public class Telefonos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;
    private String telefono_prin;
    private String telefonos;
    @Column(length = 1500, columnDefinition = "TEXT")
    private String ubicacion_map;
    private String ubicacion;
    private String categoria;


    public Telefonos() {
    }

    public Telefonos(int id, String nombre, String telefono_prin, String telefonos,
                     String ubicacion_map, String ubicacion, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.telefono_prin = telefono_prin;
        this.telefonos = telefonos;
        this.ubicacion_map = ubicacion_map;
        this.ubicacion = ubicacion;
        this.categoria = categoria;
    }
}
