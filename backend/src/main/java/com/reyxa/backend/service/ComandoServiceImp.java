package com.reyxa.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import com.reyxa.backend.model.Comando;
//import com.reyxa.backend.model.DescripcionComando;
import com.reyxa.backend.repository.ComandoRepository;
//import com.reyxa.backend.repository.DescComandoRepository;


@Service
public class ComandoServiceImp  implements ComandoService{

    @Autowired
     private ComandoRepository Comandorepository;
     //private DescComandoRepository Descrepository;

     @Override
    public  List<Comando> listaComandos(){

        return Comandorepository.findAll();
    }

    /*@Override
    public  DescripcionComando abrirExplorador() {

        DescripcionComando descripcioncomando;
     
       return Descrepository.getReferenceById(1);
    }

    @Override
    public DescripcionComando abrirBlocnotas() {
        // TODO Auto-generated method stub
        return null;
    }*/

    
    
}
