package com.reyxa.backend.model.opiniones;

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
@Entity
@Table(name = "descripcion_opiniones")
public class DescripcionOpinion {
    
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_descripcion")
    private int id_descripcion;

    @Getter
    @Setter
    @Column(name = "descripcion", length = 40)
    private String descripcion;
}
