package com.reyxa.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.reyxa.backend.model.ComandoWeb;
import com.reyxa.backend.repository.ComandoWebRepository;

@Service
public class ComandoWebServiceImp implements ComandoWebService {
    
    
    @Autowired
ComandoWebRepository repository;

    @Override
    public ComandoWeb getcomando(@PathVariable int id) {
      
        return repository.getReferenceById(id);
    }
}
