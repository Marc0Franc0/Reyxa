package com.reyxa.backend.service.comandos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.reyxa.backend.model.comandos.ComandoWeb;
import com.reyxa.backend.repository.comandos.ComandoWebRepository;

@Service
public class ComandoWebServiceImp implements ComandoWebService {
    /* 
    
    @Autowired
ComandoWebRepository repository;

    @Override
    public ComandoWeb getcomando(@PathVariable int id) {
      
        return repository.getReferenceById(id);
    }

    @Override
    public List<ComandoWeb> listaComandos() {
        
        return repository.findAll();
    }*/
}
