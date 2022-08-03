package com.reyxa.backend.service.comandos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.reyxa.backend.model.comandos.ComandoSistema;
import com.reyxa.backend.repository.comandos.ComandoSistemaRepository;


@Service
public class ComandoSistemaServiceImp  implements ComandoSistemaService{

    @Autowired
     private ComandoSistemaRepository repository;
     //private DescComandoRepository Descrepository;

     @Override
    public  List<ComandoSistema> listaComandos(){

        return repository.findAll();
    }

    @Override
    public ComandoSistema getcomando(@PathVariable int id) {
      
        return repository.getReferenceById(id);
    }

    @Override
    public String hola() {
  
        return " hola";
    }

    
    
}
