package com.reyxa.backend.model.opiniones;

import javax.persistence.Entity;

import javax.persistence.Column;

import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;
/*
 * Esta clase representa la tabla de los nombres de los comandos que va a estar representada en la base de datos
 */
@Entity
@Table(name = "opiniones")
public class Opinion {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opinion")
    private int id_opinion;
    @Getter
    @Setter
    @Column(name = "nombre",length = 40)
    private String usuario;

   @Getter
   @Setter
   @OneToOne
   @JoinColumn(name="id_descripcion",foreignKey = @ForeignKey(name = "fkdesc"),nullable=false )
      
 DescripcionOpinion id_descripcion;
}
