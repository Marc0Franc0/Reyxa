package com.reyxa.backend.repository.opiniones;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.opiniones.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository <Comentario, Integer>{
    
    @Modifying
    @Transactional
    @Query (value = "DELETE FROM descripcion_opiniones WHERE id_descripcion =:id", nativeQuery = true)
    void eliminaropinion(@Param("id") int id);
    
}
