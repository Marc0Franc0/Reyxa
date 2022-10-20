package com.reyxa.backend.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.Comentario;
/*
 * Esta interfaz hace referencia al repositorio de la base de datos de la entidad Comentario
 */
@Repository
public interface ComentarioRepository extends CrudRepository <Comentario, Integer>{
    
}
