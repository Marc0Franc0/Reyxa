package com.reyxa.backend.service.opiniones;

import java.util.List;



import com.reyxa.backend.model.opiniones.DescripcionOpinion;
import com.reyxa.backend.model.opiniones.Opinion;

public interface OpinionService {
    
    //Retorna la lista de opiniones existentes en la base de datos
    public  List <Opinion> listaOpiniones(); 
    
//Retorna una de las opiniones existentes en la base de datos por medio de su id
   // public  Opinion getopinionbyid(int id);

    //Ambos metodos son para crear una nueva opinion
    public String nuevaOpinion( Opinion opinion);
    public DescripcionOpinion nuevadesc(int id,String descripcion);


    Opinion findByUsuario(String usuario);
boolean existsByUsuario(String usuario);



   public String modificarOpinion(String usuario);
    public void modificarDesc(String usuario);

public String eliminarOpinion(String opinion);


}
