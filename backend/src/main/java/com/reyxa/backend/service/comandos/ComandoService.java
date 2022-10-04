package com.reyxa.backend.service.comandos;


import org.springframework.stereotype.Service;

import com.reyxa.backend.model.comandos.Comando;

public interface ComandoService {
    int findBynombre(String nombre);

    public  Comando getcomando(int id);

}
