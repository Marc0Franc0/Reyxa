package com.reyxa.backend.service.comandos;

import java.util.List;

import com.reyxa.backend.model.comandos.ComandoSistema;

public interface ComandoSistemaService {

    public  List <ComandoSistema> listaComandos(); 
    public  ComandoSistema getcomando(int id);
    public String hola();

}