package com.reyxa.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
/*
 * Esta clase representa la tabla de los nombres de los comandos que va a estar representada en la base de datos
 */
@Entity
@Table(name = "comandos")
public class Comando {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comando")
    public int id_comando;

    @Getter
    @Setter
    @Column(name = "nombre",length = 40)
    private String nombre;
    
  
    public Comando(){


    }
 

}
