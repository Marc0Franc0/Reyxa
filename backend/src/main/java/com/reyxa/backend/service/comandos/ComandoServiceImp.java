package com.reyxa.backend.service.comandos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.reyxa.backend.model.comandos.ComandoSistema;
import com.reyxa.backend.model.comandos.ComandoUtilidad;
import com.reyxa.backend.model.comandos.ComandoWeb;
import com.reyxa.backend.repository.comandos.ComandoSistemaRepository;
import com.reyxa.backend.repository.comandos.ComandoUtilidadRepository;
import com.reyxa.backend.repository.comandos.ComandoWebRepository;
import com.reyxa.backend.repository.comandos.DescComandoRepository;
import com.reyxa.backend.repository.opiniones.OpinionRepository;

@Service
public class ComandoServiceImp implements ComandoService {
    @Autowired
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
    public int findBynombre(String nombre) {
     int id_comando;   // TODO Auto-generated method stub}
        if(comSistrepository.findByNombre(nombre)!= null){
           id_comando = comSistrepository.findByNombre(nombre).getId_comando();
        }else if(comWebrepository.findByNombre(nombre)!= null){
            id_comando = comWebrepository.findByNombre(nombre).getId_comando(); 
        }else{
            id_comando = comUtirepository.findByNombre(nombre).getId_comando();
        }
        return id_comando; 
        
    }

    @Override
    public ComandoSistema getcomandoSist(@PathVariable int id) {
        // TODO Auto-generated method stub
        return comSistrepository.getReferenceById(id);
    }
   

    @Override
    public ComandoWeb getcomandoWeb(@PathVariable int id) {
        // TODO Auto-generated method stub
        return comWebrepository.getReferenceById(id);
    }
    @Override
    public ComandoUtilidad getcomandoUti(@PathVariable int id) {
        // TODO Auto-generated method stub
        return comUtirepository.getReferenceById(id);
    }
    

}
