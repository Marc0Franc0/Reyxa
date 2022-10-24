package com.reyxa.backend.service;

import com.reyxa.backend.model.Comando;

/*
/*
 * Interfaz la cual es implementada en la clase ComandoServiceImp, la misma solo aplica a 
 * servicios de la clase Comando y sus clases hijas
 */
public interface ComandoService {

    int obtenerId(String nombre);

    public Comando getcomando(int id);

}
