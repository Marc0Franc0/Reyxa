package com.reyxa.backend.repository.comandos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.comandos.DescripcionComando;
/*
 * Esta interfaz hace referencia al repositorio de la base de datos 
 */
@Repository
public interface  DescComandoRepository extends JpaRepository <DescripcionComando, Integer> {
}
