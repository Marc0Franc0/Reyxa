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
 * Esta clase representa la tabla de los comandos que va a estar representada en la base de datos
 */
@Entity
@Table(name = "descripcion_comandos")
public class DescripcionComando {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_descripcion")
    private int id_descripcion;

    @Getter
    @Setter
    @Column(name = "descripcion", length = 80)
    private String descripcion;

    /*@Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "id_comando",nullable = false)
    private Comando comando;
*/
    public DescripcionComando() {

    }

}
