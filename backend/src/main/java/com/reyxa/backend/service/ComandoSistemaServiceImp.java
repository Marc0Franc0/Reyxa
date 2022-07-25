package com.reyxa.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

//import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import com.reyxa.backend.model.ComandoSistema;
//import com.reyxa.backend.model.DescripcionComando;
import com.reyxa.backend.repository.ComandoSistemaRepository;
//import com.reyxa.backend.repository.DescComandoRepository;


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

    
    
}
