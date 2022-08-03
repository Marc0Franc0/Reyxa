package com.reyxa.backend.service.opiniones;

import java.util.List;



import com.reyxa.backend.model.opiniones.DescripcionOpinion;
import com.reyxa.backend.model.opiniones.Opinion;

public interface OpinionService {
    
    public  List <Opinion> listaOpiniones(); 
    public  Opinion getopinion(int id);
    public Opinion nuevaOpinion( String usuario, String descripcion);
    public DescripcionOpinion nuevadesc(String descripcion);
    public void borrarOpinion(int id);
    public void borrardesc(int id);
    public void modificarOpinion(String usuario);
    public void modificarDesc(String usuario);

}
