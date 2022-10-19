package com.reyxa.backend.service.opiniones;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyxa.backend.model.opiniones.Comentario;
import com.reyxa.backend.model.opiniones.Usuario;
import com.reyxa.backend.repository.opiniones.ComentarioRepository;
import com.reyxa.backend.repository.opiniones.UsuarioRepository;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ComentarioRepository comentarioRepository;

    Usuario usuario = new Usuario();
    Comentario comentario = new Comentario();

     @Override
    public List<Usuario> listaUsuarios() {
        // TODO Auto-generated method stub
        return (List)usuarioRepository.findAll();
    }

    /*@Override
    public Opinion getopinionbyid(@PathVariable int id) {
        // TODO Auto-generated method stub
        return opinionRepository.getReferenceById(id);
    }*/

    @Override
    public Comentario nuevoComentario( int id_descripcion,String descripcion) {
    //comentario.setId_comentario(id_descripcion);
        comentario.setComentario(descripcion);
       
       return  comentarioRepository.save(comentario);
    }

    @Override
    public String nuevoUsuario(Usuario usuario) {
        String rta;

        /*
         * Antes de crear un nuevo usuario que el mismo se crea con un comentario que haga, se verifica que no haya hecho un comentario anteriormente
         * ya que el mismo no puede hacer mas de un comentario
         * 
         */
        if(existsByNombre(usuario.getNombre())){
rta= "Ya existe un comentario de ese usuario";
        }else{
            
            //usuario.setId_usuario(id);
            usuario.setNombre(usuario.getNombre());
            /*
             * 
             En la siguiente linea se setea el valor del comentario , accediendo a la otra entidad que es Comentario la cual 
             esta relacionada con la entidad Usuario para luego poder guardar el usuario. Ya que si no se hace esto va a haber un error 
             */
             usuario.setComentario_usuario(
                nuevoComentario(usuario.getId_usuario(),usuario.getComentario_usuario().getComentario()));
            
            usuarioRepository.save(usuario);
 
            rta="Comentario guardado";
        }

return rta;
    }

    /*@Override
    public void borrarOpinionbyid(@PathVariable int id) {

        borrardesc(opinionRepository.getReferenceById(id).getId_descripcion().getId_descripcion());
        opinionRepository.deleteById(id);
    }
*/
   /*  @Override
    public void borrardesc(int id) {

        descopinionRepository.deleteById(id);
    }
*/

    
/*@Override

    public String modificarComentario(String usuario) {


usuarioRepository.modificarusuario(usuario, findByUsuario(usuario).getId_usuario());
        return "Opinion modificada";
   
}*/

    @Override
    public Usuario findByNombre(String nombre) {
    
        //Optional <Opinion> opinion = this.opinionRepository.findByUsername(usuario);
     return this.usuarioRepository.findByNombre(nombre);


    }

    


  /*@Override
 public void modificarDesc(String usuario) {
  // TODO Auto-generated method stub
  
  }
*/
@Override
public boolean existsByNombre(String nombre) {
    return usuarioRepository.existsByNombre(nombre);
}

/*@Override
public String eliminarUsuario(String usuario) {
    comentarioRepository.eliminaropinion(findByUsuario(usuario).getComentario_usuario().getId_comentario());
usuarioRepository.eliminarUsuario(usuario);

    return "Comentario del usuario "+usuario+" eliminado";
}
 */

}

/*
 * @PostMapping(path ="/add") // Map ONLY POST Requests
 * public String addNewUser( @RequestParam String username, String email, String
 * password) {
 * // @ResponseBody means the returned String is the response, not a view name
 * // @RequestParam means it is a parameter from the GET or POST request
 * 
 * Usuarios n = new Usuarios();
 * 
 * 
 * n.setUsername(username);
 * n.setEmail(email);
 * n.setPassword(password);
 * 
 * usuariosRepository.save(n);
 * return "Gurdado";
 * }
 */