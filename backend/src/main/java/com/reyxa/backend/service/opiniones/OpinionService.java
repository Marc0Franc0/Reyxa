package com.reyxa.backend.service.opiniones;

import java.util.List;
import java.util.Optional;



import com.reyxa.backend.model.opiniones.DescripcionOpinion;
import com.reyxa.backend.model.opiniones.Opinion;

public interface OpinionService {
    //Retorna la lista de opiniones existentes en la base de datos
    public  List <Opinion> listaOpiniones(); 
    
//Retorna una de las opiniones existentes en la base de datos por medio de su id
   // public  Opinion getopinionbyid(int id);

    //Ambos metodos son para crear una nueva opinion
    public String nuevaOpinion( String usuario, String descripcion);
    public DescripcionOpinion nuevadesc(String descripcion);

//Ambos metodos son para borrar una opinion
  //  public void borrarOpinionbyid(int id);
  //  public void borrardesc(int id);

    
    Opinion findByUsuario(String usuario);
boolean existsByUsuario(String usuario);

   public boolean modificarOpinion(String usuario);
    public void modificarDesc(String usuario);




}
