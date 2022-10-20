package com.reyxa.backend.service.opiniones;

import java.util.List;

import com.reyxa.backend.model.Comentario;
import com.reyxa.backend.model.Usuario;


public interface UsuarioService {
    
    //Retorna la lista de opiniones existentes en la base de datos
    public  List <Usuario> listaUsuarios(); 
    

    //Ambos metodos son para crear una nueva opinion
    public String nuevoUsuario( Usuario usuario);
    public Comentario nuevoComentario(int id,String descripcion);



    Usuario findByNombre(String usuario);
boolean existsByNombre(String usuario);



  // public String modificarComentario(String usuario);
    //public void modificarDesc(String usuario);

//public String eliminarUsuario(String opinion);


}
