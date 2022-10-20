package com.reyxa.backend.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.Comando;
/*
 * Esta interfaz hace referencia al repositorio de la base de datos de la entidad Comando
 */
@Repository
public interface ComandoRepository extends CrudRepository < Comando, Integer> {
    Comando findByNombre(String nombre);
}
