package com.reyxa.backend.repository.opiniones;


import java.util.Optional;

import javax.print.DocFlavor.STRING;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.opiniones.Opinion;

@Repository
public interface OpinionRepository  extends JpaRepository <Opinion, Integer>{


//Optional<Opinion> findByUsuario(String usuario);
Opinion findByUsuario(String usuario);
Boolean existsByUsuario(String usuario);



}
