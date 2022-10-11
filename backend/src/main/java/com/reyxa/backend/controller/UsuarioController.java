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
import com.reyxa.backend.model.opiniones.Usuario;




@RestController
@Configuration
@EnableAutoConfiguration
public class UsuarioController extends Main {
   
Usuario usuario = new Usuario();
 
    //Funciona, probado en postman
   @GetMapping("/usuarios")
    public List<Usuario> listaUsuarios(){
     return usuarioService.listaUsuarios();
    }
        //Funciona, probado en postman
    @GetMapping(path = "/buscarusuario")
    public String buscaropinion( @RequestParam String nombre) {
   
       if(usuarioService.existsByNombre(nombre)){
          usuario = this.usuarioService.findByNombre(nombre);
          return "Comentario encontrado: "+ usuario.getComentario_usuario().getComentario();
   
       }else{
            return "No se encontro un comentario de ese usuario";  
       }
   
    }
    //Funciona, probado en postman 
    @PostMapping(path = "/usuarionuevo")
    public String nuevaOpinion( @RequestBody Usuario usuario ) {

      return usuarioService.nuevoUsuario(usuario);
    }



  /*Queda a implementar los dos mapping siguientes 
   * 
  */
    /*@PutMapping("/editarcomentario")
    public String modificarUsuario( @RequestBody String usuario ) {

        return usuarioService.modificarComentario(usuario);
      }
  */

    /*@DeleteMapping("/eliminarcomentario")
    public String eliminarUsuario( @RequestParam String usuario ) {

        return usuarioService.eliminarUsuario(usuario);
      }
*/
  
   

    
}
