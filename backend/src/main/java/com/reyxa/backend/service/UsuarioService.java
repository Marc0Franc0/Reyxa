package com.reyxa.backend.service;

import java.util.List;

import com.reyxa.backend.model.Comentario;
import com.reyxa.backend.model.Usuario;


/*
 * Interfaz la cual es implementada en la clase UsuarioServdeImp, la misma solo aplica a 
 * servicios de la clase Usuario y sus clases hijas
 */
    public interface UsuarioService {
    
    //Retorna la lista de opiniones existentes en la base de datos
    public  List <Usuario> listaUsuarios(); 
    

    public String nuevoUsuario( Usuario usuario);
    public Comentario nuevoComentario(int id, String coment);

    public String editarUsuario(int id,Usuario usuario);

    Usuario findByNombre(String usuario);
    boolean existsByNombre(String usuario);


    public String borrarUsuario(int id);

}
