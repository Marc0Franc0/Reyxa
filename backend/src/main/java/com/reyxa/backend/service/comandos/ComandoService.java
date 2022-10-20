package com.reyxa.backend.service.comandos;

import com.reyxa.backend.model.Comando;

/*
 * Interfaz la cual brinda los metodos utilizados dentro del controlador UsuarioController
 */
public interface ComandoService {
    int findBynombre(String nombre);

    public Comando getcomando(int id);

}
