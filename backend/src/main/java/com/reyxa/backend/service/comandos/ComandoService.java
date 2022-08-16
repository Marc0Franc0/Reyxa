package com.reyxa.backend.service.comandos;

import com.reyxa.backend.model.comandos.ComandoSistema;
import com.reyxa.backend.model.comandos.ComandoUtilidad;
import com.reyxa.backend.model.comandos.ComandoWeb;

public interface ComandoService {
    int findBynombre(String nombre);

    public  ComandoSistema getcomandoSist(int id);
    public  ComandoWeb getcomandoWeb(int id);
    public  ComandoUtilidad getcomandoUti(int id);
}
