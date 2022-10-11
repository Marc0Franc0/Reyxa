package com.reyxa.backend.repository.comandos;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.Comando;
/*
 * Esta interfaz hace referencia al repositorio de la base de datos 
 */
@Repository
public interface ComandoRepository extends CrudRepository < Comando, Integer> {
    Comando findByNombre(String nombre);
}
