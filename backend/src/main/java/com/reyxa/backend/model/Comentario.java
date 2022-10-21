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
 * Esta clase representa la tabla de los comentarios de los usuarios, almacenados en la
 * base de datos
 */

@Entity
@Table(name = "comentarios")
public class Comentario {
    
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_comentario")
    private int id_comentario;

    @Getter
    @Setter
    @Column(name = "comentario", length = 200)
    private String comentario;
}
