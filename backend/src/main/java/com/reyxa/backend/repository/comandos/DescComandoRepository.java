package com.reyxa.backend.repository.comandos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.SintaxisComando;
/*
 * Esta interfaz hace referencia al repositorio de la base de datos 
 */
@Repository
public interface  DescComandoRepository extends CrudRepository <SintaxisComando, Integer> {
}
