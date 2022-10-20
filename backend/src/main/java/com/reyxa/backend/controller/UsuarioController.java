package com.reyxa.backend.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reyxa.backend.Main;
import com.reyxa.backend.model.Usuario;

@RestController
@Configuration
@EnableAutoConfiguration
/*
 * Marca la clase como un controlador donde cada método devuelve
 * un objeto de dominio en lugar de una vista.
 */
public class UsuarioController extends Main {

    Usuario usuario = new Usuario();

    /*
     * Funciona, probado en postman.
     * Mapping que retorna la lista de todos los usuarios almacenados en la base de
     * datos
     * 
     */
    @GetMapping("/usuarios")
    public List<Usuario> listaUsuarios() {
        return usuarioService.listaUsuarios();
    }

    /*
     * Funciona, probado en postman
     * Este mapping retorna un usuario, buscandolo por medio del atributo nombre.El
     * cual se pide a la base de datos por medio de parametros con la anotacion @RequestParam.
     * 
     */
    @GetMapping(path = "/buscarusuario")
    public String buscaropinion(@RequestParam String nombre) {

        /*Se analizan las posibles respuestas de acuerdo a si existe o no existe el usuario solicitado, 
        con una sentencia condicional, retornando un string determinado para cada situación.
         * 
        */
        if (usuarioService.existsByNombre(nombre)) {
            usuario = this.usuarioService.findByNombre(nombre);
            return "Comentario encontrado: " + usuario.getComentario_usuario().getComentario();

        } else {
            return "No se encontro un comentario de ese usuario";
        }

    }

    /*-Funciona, probado en postman
     * -El mapping siguiente permite la creación dentro de la base de datos de un nuevo usuario,
     * pidiendo por parametros los atributos de la clase Usuario, los cuales son solicitados utilizando
     * la anotación @RequestBody que la misma permite encapsular todos los atributos de la clase Usuario en una 
     * variable de la misma
     * 
     */
    @PostMapping(path = "/usuarionuevo")
    public String nuevaOpinion(@RequestBody Usuario usuario) {

        return usuarioService.nuevoUsuario(usuario);
    }


    //No anda
    /*
     * @PutMapping("/editarcomentario")
     * public String modificarUsuario( @RequestBody String usuario ) {
     * 
     * return usuarioService.modificarComentario(usuario);
     * }
     */

}
