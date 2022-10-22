package com.reyxa.backend.service;

import java.util.List;

import com.reyxa.backend.model.Comentario;
import com.reyxa.backend.model.Usuario;


public interface UsuarioService {
    
    //Retorna la lista de opiniones existentes en la base de datos
    public  List <Usuario> listaUsuarios(); 
    

    //Ambos metodos son para crear una nueva opinion
    public String nuevoUsuario( Usuario usuario);
    public Comentario nuevoComentario(int id, String coment);



    Usuario findByNombre(String usuario);
boolean existsByNombre(String usuario);




}
