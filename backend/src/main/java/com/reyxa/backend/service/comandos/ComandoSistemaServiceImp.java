package com.reyxa.backend.service.comandos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.reyxa.backend.model.comandos.ComandoSistema;
import com.reyxa.backend.repository.comandos.ComandoSistemaRepository;
import com.reyxa.backend.repository.comandos.ComandoUtilidadRepository;
import com.reyxa.backend.repository.comandos.ComandoWebRepository;
import com.reyxa.backend.repository.comandos.DescComandoRepository;
import com.reyxa.backend.repository.opiniones.OpinionRepository;


@Service
public class ComandoSistemaServiceImp  implements ComandoSistemaService{

   /*@Autowired
     private ComandoSistemaRepository comSistrepository;
     //private DescComandoRepository Descrepository;
     @Autowired
     private ComandoUtilidadRepository comUtirepository;
     @Autowired
     private ComandoWebRepository comWebrepository;
     //private DescComandoRepository Descrepository;
     @Autowired
     private DescComandoRepository descComandoRepository;
     //private DescComandoRepository Descrepository;

     @Override
    public  List<ComandoSistema> listaComandos(){

        return comSistrepository.findAll();
    }

    @Override
    public ComandoSistema getcomando(@PathVariable int id) {
      
        return comSistrepository.getReferenceById(id);
    }

    @Override
    public String hola() {
  
        return " hola";
    }

 

    @Override
    public int findBynombre(String nombre) {
       
        return comSistrepository.findByNombre(nombre).getId_comando();
    }

    
    */
}
