package com.reyxa.backend.repository.opiniones;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reyxa.backend.model.opiniones.DescripcionOpinion;
@Repository
public interface DescOpinionRepository extends JpaRepository <DescripcionOpinion, Integer>{
   
}
