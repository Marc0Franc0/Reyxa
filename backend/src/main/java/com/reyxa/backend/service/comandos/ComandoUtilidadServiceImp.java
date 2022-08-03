package com.reyxa.backend.service.comandos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.reyxa.backend.model.comandos.ComandoUtilidad;
import com.reyxa.backend.repository.comandos.ComandoUtilidadRepository;

@Service
public class ComandoUtilidadServiceImp implements ComandoUtilidadService {

    @Autowired
ComandoUtilidadRepository repository;

    @Override
    public ComandoUtilidad getcomando(@PathVariable int id) {
      
        return repository.getReferenceById(id);
    }

    @Override
    public List<ComandoUtilidad> listaComandos() {
        
        return repository.findAll();
    }
    
}
