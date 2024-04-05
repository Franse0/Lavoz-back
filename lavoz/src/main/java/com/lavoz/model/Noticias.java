package com.lavoz.model;


import com.lavoz.util.HtmlEncodingHelper;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "noticias")
@Getter @Setter
public class Noticias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String titulo;
    @Column(length = 2500, columnDefinition = "TEXT")
    private String cuerpo;
    @Column(length = 1500)
    private String resumen;
    private String fecha_publi;
    private String img;
    private String url_img;
    private String categoria;

    public Noticias(Long id, String titulo, String cuerpo, String resumen,
                    String fecha_publi,  String url_img,
                    String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.resumen = resumen;
        this.fecha_publi = fecha_publi;
        this.url_img = url_img;
        this.categoria = categoria;
    }

    public Noticias(Long id, String titulo, String cuerpo, String resumen,
                    String fecha_publi, String img, String url_img,
                    String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.resumen = resumen;
        this.fecha_publi = fecha_publi;
        this.img = img;
        this.url_img = url_img;
        this.categoria = categoria;
    }

    public Noticias() {
    }


    public void encodeCuerpoHtml() {
        this.cuerpo = HtmlEncodingHelper.encodeHtml(this.cuerpo);
    }

    // Método para decodificar el cuerpo HTML
    public void decodeCuerpoHtml() {
        this.cuerpo = HtmlEncodingHelper.decodeHtml(this.cuerpo);
    }
}