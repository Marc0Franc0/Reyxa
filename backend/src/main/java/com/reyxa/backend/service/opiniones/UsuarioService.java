package com.reyxa.backend.service.opiniones;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reyxa.backend.model.opiniones.Comentario;
import com.reyxa.backend.model.opiniones.Usuario;

public interface UsuarioService {
    
    //Retorna la lista de opiniones existentes en la base de datos
    public  List <Usuario> listaUsuarios(); 
    
//Retorna una de las opiniones existentes en la base de datos por medio de su id
   // public  Opinion getopinionbyid(int id);

    //Ambos metodos son para crear una nueva opinion
    public String nuevoUsuario( Usuario usuario);
    public Comentario nuevoComentario(int id,String descripcion);


    Usuario findByUsuario(String usuario);
boolean existsByUsuario(String usuario);



   public String modificarUsuario(String usuario);
    public void modificarDesc(String usuario);

public String eliminarUsuario(String opinion);


}
