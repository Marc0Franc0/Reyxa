package com.reyxa.backend.service;

import java.util.List;


import com.reyxa.backend.model.ComandoSistema;
//import com.reyxa.backend.model.DescripcionComando;

public interface ComandoSistemaService {

    public  List <ComandoSistema> listaComandos(); 
    public  ComandoSistema getcomando(int id);
}