package com.reyxa.backend.service.comandos;


import com.reyxa.backend.model.comandos.Comando;

public interface ComandoService {
    int findBynombre(String nombre);

    public  Comando getcomando(int id);

}
