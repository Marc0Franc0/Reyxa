package com.reyxa.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reyxa.backend.Main;
import com.reyxa.backend.model.Usuario;
import com.reyxa.backend.repository.UsuarioRepository;

@RestController
@Configuration
@EnableAutoConfiguration
/*
 * Marca la clase como un controlador donde cada método devuelve
 * un objeto de dominio en lugar de una vista.
 */
public class UsuarioController extends Main {

    Usuario usuario = new Usuario();
    @   Autowired
    UsuarioRepository repo;

    /*
     * Funciona, probado en postman.
     * Mapping que retorna la lista de todos los usuarios almacenados en la base de
     * datos
     * 
     */
    @GetMapping("/usuarios")
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.listaUsuarios();
    }

    /*
     * Funciona, probado en postman
     * Este mapping retorna un usuario, buscandolo por medio del atributo nombre. El
     * cual se pide a la base de datos por medio de parametros con la anotacion @RequestParam.
     * 
     */
    @GetMapping(path = "/buscarusuario")
    public Usuario buscarUsuario(@RequestParam String nombre) {

        /*Se analizan las posibles respuestas de acuerdo a si existe o no existe el usuario solicitado, 
        con una sentencia condicional, retornando un string determinado para cada situación.
         * 
        */
            usuario = this.usuarioService.findByNombre(nombre);
            return  usuario;

        
    }

    /*-Funciona, probado en postman
     * -El mapping siguiente permite la creación dentro de la base de datos de un nuevo usuario,
     * pidiendo por parametros los atributos de la clase Usuario, los cuales son solicitados utilizando
     * la anotación @RequestBody que la misma permite encapsular todos los atributos de la clase Usuario en una 
     * variable de la misma
     * 
     */
    @PostMapping(path = "/usuarionuevo")
    public String nuevoUsuario(@RequestBody Usuario usuario) {

        return usuarioService.nuevoUsuario(usuario);
    }


    /*
     * Funciona probado en Postman, solo que cuando se le manda por parametros un id el cual no
     * esta almacenado en la base de datos este lanza un error 500 el cuale s por parametros.
     * Pero al enviar ese parametro bien con un id que exista funciona correctamente
     */
@PutMapping(path = "/editarusuario/{id}")
public String editarUsuario(@RequestBody  Usuario usuario,@PathVariable int id){

return usuarioService.editarUsuario(id,usuario);
}

    /* Mapping que elimina un usuario junto con su respectivo comentario a través del id. */
    @DeleteMapping(path = "/borrarusuario")
    public String borrarUsuario (@RequestParam int id){
        return usuarioService.borrarUsuario(id);
    }
}
