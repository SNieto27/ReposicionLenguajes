package com.reposicion.reposicion.Modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "posiciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Posicion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int empates;

    private int ganados;

    @Column(name = "golescontra")
    private int golesContra;

    @Column(name = "golesfavor")
    private int golesFavor;

    private int perdidos;

    private int puntos;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "codigoequipo", referencedColumnName = "codigoEquipo")
    private Equipo equipo;

}
