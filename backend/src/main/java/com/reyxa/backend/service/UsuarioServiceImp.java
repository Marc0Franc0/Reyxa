package com.reyxa.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reyxa.backend.model.Comentario;
import com.reyxa.backend.model.Usuario;
import com.reyxa.backend.repository.ComentarioRepository;
import com.reyxa.backend.repository.UsuarioRepository;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined;

/*
 * -Clase la cual es utilizada como servicio e implementa la interfaz de UsuaroService.
 */
@Service
public class UsuarioServiceImp implements UsuarioService {

    /*
     * Instancias de un objeto de los repositorios "UsuarioRepository" y
     * "ComentarioRepository"
     */
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ComentarioRepository comentarioRepository;

    /*
     * Instancias de objeto de las clases "Usuario" y "Comentario"
     */
    Usuario usuario = new Usuario();
    Comentario comentario = new Comentario();

    List<Usuario> usuarios;

    // Se sobreescribe el metodo utilizando en su retorno un metodo del repositorio
    // correspondiente
    @Override
    public List<Usuario> listaUsuarios() {
        return (List) usuarioRepository.findAll();
    }

    // Se sobreescribe el metodo utilizando en su retorno un metodo del repositorio
    // correspondiente
    @Override
    public Comentario nuevoComentario(int id, String coment) {
        comentario.setId_comentario(id);
        comentario.setComentario(coment);

        return comentarioRepository.save(comentario);
    }

    /*-El metodo siguiente crea un nuevo usuario junto con su comentario.
    -Establece el nombre y luego el comentario
    -Para crear el comentario utiliza el metodo "nuevoComentario()".
    -Retorna un string para saber si se puede crear o no un nuevo usuario
     * 
    */

    @Override
    public String nuevoUsuario(Usuario usuario) {
        String rta;

        /*
         * Antes de crear un nuevo usuario que el mismo se crea con un comentario que
         * haga,
         * se verifica que no haya hecho un comentario anteriormente
         * ya que el mismo no puede hacer mas de un comentario
         * 
         */
        if (existsByNombre(usuario.getNombre())) {
            rta = "Ya existe un comentario de ese usuario";
        } else {

            usuario.setNombre(usuario.getNombre());
            /*
             * 
             * En la siguiente linea se setea el valor del comentario ,
             * accediendo a la otra entidad que es Comentario la cual
             * esta relacionada con la entidad Usuario para luego poder guardar el usuario.
             * Ya que si no se hace esto va a haber un error porque ambas entidades estan
             * relacionadas
             */
            usuario.setComentario_usuario(
                    nuevoComentario(
                            usuario.getId_usuario(), usuario.getComentario_usuario().getComentario()));

            usuarioRepository.save(usuario);

            rta = "Comentario guardado";
        }

        return rta;
    }

    // Metodo que busca a un usuario junto con todos sus atributos por medio de su
    // nombre
    @Override
    public Usuario findByNombre(String nombre) {
        return this.usuarioRepository.findByNombre(nombre);
    }

    // Verifica con su repositorio correspondiente si un usuario existe por medio de
    // su nombre
    @Override
    public boolean existsByNombre(String nombre) {
        return usuarioRepository.existsByNombre(nombre);
    }

    // Este metodo permite editar un usuario
    @Override
    public String editarUsuario(int id, Usuario usuarionuevo) {
        String rta;
        Usuario usuarioalmacenado;

        if (usuarioRepository.existsById(id).equals(true)) {
//Si el usuario existe se crea un objeto de tipo Usuario con los datos del mismo
             usuarioalmacenado = usuarioRepository.findById(id).get();
            

            /* 
         * Condicional para evaluar que no sean los mismos datos los que se van a cambiar para no 
         * realizar un update innecesario
         */
              
             if(usuarioalmacenado.getNombre().equals(usuarionuevo.getNombre())&&
             usuarioalmacenado.getComentario_usuario().getComentario().equals( usuarionuevo.getComentario_usuario().getComentario())){
                 rta = "No se realizaron cambios";
 
             }else {
 
                             usuarionuevo.setId_usuario(usuarioalmacenado.getId_usuario());
             usuarioRepository.save(usuarionuevo);
 
             rta = "Se realizaron los cambios correctamente";
             }
            } 
            else {
             rta = "No se encontro un usuario anteriormente por lo que no se puede editar";
               
            }

       
          

       

        return rta;

    }

}
