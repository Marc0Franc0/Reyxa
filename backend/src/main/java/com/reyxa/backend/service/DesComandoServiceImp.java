package com.reyxa.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyxa.backend.model.DescripcionComando;
import com.reyxa.backend.repository.DescComandoRepository;

@Service
public  class DesComandoServiceImp implements DescComandoService{

    @Autowired
    DescComandoRepository repository;

    @Override
    public  List<DescripcionComando> listadescripcion() {
        return repository.findAll();
    }
 
    
    
}
