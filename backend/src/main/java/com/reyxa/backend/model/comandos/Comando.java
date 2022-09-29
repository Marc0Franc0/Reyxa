package com.reyxa.backend.model.comandos;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import lombok.Getter;
import lombok.Setter;

    @Entity
    @Table(name = "comandos")
    public class Comando {

        @Getter
        @Setter
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id_comando")
        public int id_comando;

        @Getter
        @Setter
        @Column(name = "nombre", length = 40)
        private String nombre;

        @Getter
        @Setter
        @OneToOne()
        @JoinColumn(name = "sintaxis_comando", nullable = false, foreignKey = @ForeignKey(name = "fkdesc"))
        private DescripcionComando sintaxis_comando;

        public Comando() {

        }
    }


