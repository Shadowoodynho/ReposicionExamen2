package com.example.examen_repo_2.Services;

import com.example.examen_repo_2.Models.Equipos;

public interface EquiposServices {

    public Equipos crearEquipos(Equipos nuevoEquipo);

    public String eliminarEquipos(int codigoEquipo);

    public Equipos buscarEquipos(int codigoEquipo);

}
