package com.reyxa.backend.repository.comandos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.comandos.ComandoWeb;
/*
 * Esta interfaz hace referencia al repositorio de la base de datos 
 */
@Repository
public interface ComandoWebRepository extends JpaRepository < ComandoWeb, Integer> {
    
}
