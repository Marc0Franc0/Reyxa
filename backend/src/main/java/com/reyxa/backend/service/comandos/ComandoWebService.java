package com.reyxa.backend.service.comandos;

import java.util.List;

import com.reyxa.backend.model.comandos.ComandoWeb;

public interface ComandoWebService {
    public  List <ComandoWeb> listaComandos(); 
    public  ComandoWeb getcomando(int id);
}
