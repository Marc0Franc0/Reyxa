package com.reyxa.backend.model;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;
/*
 * Esta clase representa la tabla de los usuarios los cuales escribieron un comentario 
 * y fueron almacenados en la base de datos
 * 
 */
@Entity
@Table(name = "usuarios",uniqueConstraints = @UniqueConstraint(columnNames={"nombre_de_usuario"}))
public class Usuario {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private int id_usuario;
    @Getter
    
    @Setter
    @Column(name = "nombre_de_usuario",length = 40)
    private String nombre;

   @Getter
   @Setter
   /*-Atributo relaconado con la entidad Comentario
    * -La relacion es de uno a uno por lo que un usuario solo puede tener un comentario y un comentario solo puede
    pertenecer a un usuario.
   */
   @OneToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="comentario_usuario", foreignKey = @ForeignKey(name = "fkcomentario"))
      
    Comentario comentario_usuario;

    @Getter
    @Setter
    @Column(name = "activo")
    private boolean activo;
}
