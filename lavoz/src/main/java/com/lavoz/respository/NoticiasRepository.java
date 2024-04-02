package com.lavoz.respository;

import com.lavoz.model.Noticias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticiasRepository extends JpaRepository<Noticias, Long> {
    @Query(value = "SELECT * FROM noticias WHERE LOWER(cuerpo) LIKE LOWER(CONCAT('%', :parametro, '%')) OR LOWER(titulo) LIKE LOWER(CONCAT('%', :parametro, '%'))", nativeQuery = true)
//  @Query("SELECT a FROM noticias a WHERE  LOWER(a.cuerpo) = LOWER(:parametro) OR LOWER(a.titulo) = LOWER(:parametro)")
    List<Noticias>buscarIgnoreCase(@Param("parametro")String parametro);
}
