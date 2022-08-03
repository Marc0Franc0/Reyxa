package com.reyxa.backend.service.comandos;


import java.util.List;

import com.reyxa.backend.model.comandos.ComandoUtilidad;

public interface ComandoUtilidadService {
    public  List <ComandoUtilidad> listaComandos(); 
    public  ComandoUtilidad getcomando(int id);
}
