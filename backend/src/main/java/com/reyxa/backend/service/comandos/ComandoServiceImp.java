package com.reyxa.backend.service.comandos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.reyxa.backend.model.Comando;
import com.reyxa.backend.repository.comandos.ComandoRepository;

@Service

public class ComandoServiceImp implements ComandoService {

    @Autowired
    private ComandoRepository comandoRepository;
    //private DescComandoRepository Descrepository;
    //private DescComandoRepository Descrepository;
    @Override
    public int findBynombre(String nombre) {
        int id_comando;  
   
        id_comando = comandoRepository.findByNombre(nombre).getId_comando();
        return id_comando; 
    }

   

    @Override
    public Comando getcomando(@PathVariable int id) {
        // TODO Auto-generated method stub
        return comandoRepository.findById(id).get();
    }
   

}
