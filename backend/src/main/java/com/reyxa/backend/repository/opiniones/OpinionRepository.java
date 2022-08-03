package com.reyxa.backend.repository.opiniones;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.opiniones.Opinion;

@Repository
public interface OpinionRepository  extends JpaRepository <Opinion, Integer>{
    
}
