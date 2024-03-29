package com.reyxa.backend.model;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
/*
 * Esta clase representa la tabla con la sintaxis de los comandos 
 * que va a estar representada en la base de datos
 */
@Entity
@Table(name = "sintaxis_de_comandos")
public class SintaxisComando {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sintaxis")
    private int id_sintaxis;

    @Getter
    @Setter
    @Column(name = "sintaxis", length = 80)
    private String sintaxis;
  
    @Getter
    @Setter
    @Column(name = "descripcion", length = 80)
    private String descripcion;

  

}
