package com.reyxa.backend.repository.opiniones;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.opiniones.Comentario;

@Repository
public interface ComentarioRepository extends CrudRepository <Comentario, Integer>{
    
   /*  @Modifying
    @Transactional
    @Query (value = "DELETE FROM descripcion_opiniones WHERE id_descripcion =:id", nativeQuery = true)
    void eliminaropinion(@Param("id") int id);*/
    
}
