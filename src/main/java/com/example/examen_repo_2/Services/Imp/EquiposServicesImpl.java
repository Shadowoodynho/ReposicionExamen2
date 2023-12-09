package com.example.examen_repo_2.Services.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen_repo_2.Models.Equipos;
import com.example.examen_repo_2.Repositories.EquiposRepository;
import com.example.examen_repo_2.Services.EquiposServices;

@Service
public class EquiposServicesImpl implements EquiposServices {

    @Autowired
    private EquiposRepository equiposRepository;

    @Override
    public Equipos crearEquipos(Equipos nuevoEquipo) {
        return this.equiposRepository.save(nuevoEquipo);
    }

    @Override
    public String eliminarEquipos(int codigoEquipo) {
        Equipos equipoEliminar = this.equiposRepository.findById(codigoEquipo).get();
        if (equipoEliminar != null) {
            this.equiposRepository.delete(equipoEliminar);
            return "Se ha eliminado equipo con codigo " + codigoEquipo;
        }
        return "No existe equipo con codigo :" + codigoEquipo;
    }

    @Override
    public Equipos buscarEquipos(int codigoEquipo) {
        return this.equiposRepository.findById(codigoEquipo).get();
    }

}
