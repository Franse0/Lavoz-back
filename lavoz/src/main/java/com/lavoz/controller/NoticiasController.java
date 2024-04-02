    package com.lavoz.controller;

    import com.lavoz.model.Noticias;
    import com.lavoz.service.NoticiasService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.MediaType;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    import org.springframework.web.multipart.MultipartFile;

    import java.util.List;
    import java.util.Optional;

    @RestController
    //@RequestMapping("/noticia")
    @CrossOrigin(origins = "http://localhost:4200")

    public class NoticiasController {

        @Autowired
        private NoticiasService noticiasService;

        @GetMapping("/noticias")
        @ResponseBody
        public List<Noticias>verNoticias(){
            return noticiasService.verNoticias();
        }

        @GetMapping("/noticia/{id}")
        @ResponseBody
        public Optional<Noticias> verNoticia(@PathVariable Long id){
            return  noticiasService.verNoticia(id);
        }

        @DeleteMapping("/noticia/borrar/{id}")
        public void borrarNoticia(@PathVariable Long id){
            noticiasService.borrarNoticia(id);
        }

        /*@CrossOrigin(origins = "http://localhost:4200")
        @PostMapping("/noticia/cargar")
        public void crearNoticia(@RequestParam("nombre") String titulo,
                                 @RequestParam("cuerpo") String cuerpo,
                                 @RequestParam("resumen") String resumen,
                                 @RequestParam("rutaImg") String fecha_publi,
                                 @RequestParam("rutaImg") String url_img,
                                 @RequestParam("rutaImg") String categoria,
                                 @RequestParam("file") MultipartFile imagen){
            noticiasService.nuevaNoticia(titulo, cuerpo, resumen, fecha_publi,url_img, imagen, categoria );
        }





        @GetMapping("/noticia/imagen/{id}")
        public ResponseEntity<byte[]> obtenerImagenDeNoticia(@PathVariable Long id) {
            // Lógica para obtener los bytes de la imagen de la noticia con el ID proporcionado
            byte[] imagenBytes = noticiasService.obtenerBytesDeImagen(id);

            // Devuelve los bytes de la imagen como una respuesta HTTP
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imagenBytes);
        }
*/
        @GetMapping("/noticia/buscar/{parametro}")
        public ResponseEntity<List<Noticias>>buscarNoticia(@PathVariable String parametro){
            List<Noticias> resultados = noticiasService.buscarFiestasNombreUbicacion(parametro);
            return ResponseEntity.ok(resultados);
        }
        @CrossOrigin(origins = "http://localhost:4200")
        @PostMapping("/noticia/cargar")
        public void crearNoticia(@RequestBody Noticias noticias){
            noticiasService.nuevaNoticia(noticias);
        }
    }
