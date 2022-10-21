package com.reyxa.backend.service;

import com.reyxa.backend.model.Comando;

/*
 * Interfaz la cual brinda los metodos utilizados dentro del controlador UsuarioController
 */
public interface ComandoService {

    int obtenerId(String nombre);

    public Comando getcomando(int id);

}
