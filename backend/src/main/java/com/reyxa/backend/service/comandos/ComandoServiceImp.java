package com.reyxa.backend.service.comandos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    /* 
    Se sobrescribe el siguiente metodo para buscar un 
    comando junto con todos sus atributos por medio de su nombre
    */
    @Override
    public int findBynombre(String nombre) {
        int id_comando;

        id_comando = comandoRepository.findByNombre(nombre).getId_comando();
        return id_comando;
    }

    @Override
    public Comando getcomando(@PathVariable int id) {

        return comandoRepository.findById(id).get();
    }

}
