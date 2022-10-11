package com.reyxa.backend.repository.opiniones;





import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.opiniones.Usuario;

@Repository
public interface UsuarioRepository  extends CrudRepository <Usuario, Integer>{


//Optional<Opinion> findByUsuario(String usuario);
Usuario findByNombre(String usuario);
Boolean existsByNombre (String nombre_de_usuario);


/*@Modifying
@Transactional
@Query (value = "DELETE FROM opiniones WHERE nombre =:nombre", nativeQuery = true)
void eliminarUsuario(@Param("nombre") String usuario);

@Modifying
@Transactional
@Query (value = "UPDATE opiniones  SET nombre = :usuario WHERE id =:id", nativeQuery = true)
void modificarUsuario( @Param("nombre") String usuario,@Param("id") int id );*/

}
