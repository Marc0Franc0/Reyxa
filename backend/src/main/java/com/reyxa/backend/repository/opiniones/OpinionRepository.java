package com.reyxa.backend.repository.opiniones;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.opiniones.Opinion;

@Repository
public interface OpinionRepository  extends JpaRepository <Opinion, Integer>{


//Optional<Opinion> findByUsuario(String usuario);
Opinion findByUsuario(String usuario);
Boolean existsByUsuario(String usuario);


@Modifying
@Transactional
@Query (value = "DELETE FROM opiniones WHERE nombre =:usuario", nativeQuery = true)
void eliminaropinion(@Param("usuario") String usuario);

@Modifying
@Transactional
@Query (value = "UPDATE opiniones  SET nombre = :usuario WHERE id =:id", nativeQuery = true)
void modificarusuario( @Param("usuario") String usuario,@Param("id") int id );

}
