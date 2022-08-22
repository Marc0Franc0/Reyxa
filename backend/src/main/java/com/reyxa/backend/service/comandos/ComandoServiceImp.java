package com.reyxa.backend.service.comandos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.reyxa.backend.model.comandos.Comando;
import com.reyxa.backend.repository.comandos.ComandoWebRepository;


@Service
public class ComandoServiceImp implements ComandoService {

    @Autowired
    private ComandoWebRepository comWebrepository;
    //private DescComandoRepository Descrepository;
    //private DescComandoRepository Descrepository;
    @Override
    public int findBynombre(String nombre) {
        int id_comando;  
     /* // TODO Auto-generated method stub}
        if(comSistrepository.findByNombre(nombre)!= null){
           id_comando = comSistrepository.findByNombre(nombre).getId_comando();
        }else if(comWebrepository.findByNombre(nombre)!= null){
            id_comando = comWebrepository.findByNombre(nombre).getId_comando(); 
        }else{
            id_comando = comUtirepository.findByNombre(nombre).getId_comando();
        }*/
        id_comando = comWebrepository.findByNombre(nombre).getId_comando();
        return id_comando; 
        
    }

   

    @Override
    public Comando getcomando(@PathVariable int id) {
        // TODO Auto-generated method stub
        return comWebrepository.getReferenceById(id);
    }
   

}
