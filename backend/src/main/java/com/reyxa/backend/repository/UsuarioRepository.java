package com.reyxa.backend.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.Usuario;
/*
 * Esta interfaz hace referencia al repositorio de la base de datos de la entidad Usuario
 */
@Repository
public interface UsuarioRepository  extends CrudRepository <Usuario, Integer>{


Usuario findByNombre(String usuario);
Boolean existsByNombre (String nombre_de_usuario);
Boolean existsById(int id);

//Usuario findById(int Id);

}
