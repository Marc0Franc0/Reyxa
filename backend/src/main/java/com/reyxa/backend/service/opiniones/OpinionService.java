package com.reyxa.backend.service.opiniones;

import java.util.List;



import com.reyxa.backend.model.opiniones.DescripcionOpinion;
import com.reyxa.backend.model.opiniones.Opinion;

public interface OpinionService {
    //Retorna la lista de opiniones existentes en la base de datos
    public  List <Opinion> listaOpiniones(); 
    
//Retorna una de las opiniones existentes en la base de datos por medio de su id
    public  Opinion getopinionbyid(int id);

    //Ambos metodos son para crear una nueva opinion
    public Opinion nuevaOpinion( String usuario, String descripcion);
    public DescripcionOpinion nuevadesc(String descripcion);

//Ambos metodos son para borrar una opinion
    public void borrarOpinionbyid(int id);
    public void borrardesc(int id);

    
    public void modificarOpinion(String usuario);
    public void modificarDesc(String usuario);




}
