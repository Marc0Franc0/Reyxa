package com.reyxa.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyxa.backend.model.Comando;
import com.reyxa.backend.repository.ComandoRepository;

/*
 * -Clase la cual es utilizada como servicio e implementa la interfaz de ComandoService.
 */
@Service

public class ComandoServiceImp implements ComandoService {

    // Se instancia el repositorio "ComandoRepository"
    @Autowired
    private ComandoRepository comandoRepository;

    
   // Se sobrescribe el siguiente metodo para obtener el id de un comando por medio de su nombre.
    
    @Override
    public int obtenerId(String nombre) {
        int id_comando;

        id_comando = comandoRepository.findByNombre(nombre).getId_comando();
        return id_comando;
    }

 /* 
    Se sobrescribe el siguiente metodo para buscar un 
    comando junto con todos sus atributos por medio de su id, el mismo retorna el comando junto 
    con todos sus atributos.
    */
    
    @Override
    public Comando getcomando( int id) {

        return comandoRepository.findById(id).get();
    }

}
