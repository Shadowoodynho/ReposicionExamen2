package com.example.examen_repo_2.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "posiciones")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Posiciones {

    @EmbeddedId
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigoequipo")
    private Equipos codigoEquipo;

    @Column(name = "empates")
    private int empates;

    @Column(name = "ganados")
    private int ganados;

    @Column(name = "perdidos")
    private int perdidos;

    @Column(name = "golesafavor")
    private int golesAFavor;

    @Column(name = "golescontra")
    private int golesContra;

    @Column(name = "puntos")
    private int puntos;

}
