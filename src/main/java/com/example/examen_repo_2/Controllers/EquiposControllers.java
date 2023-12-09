package com.example.examen_repo_2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen_repo_2.Models.Equipos;
import com.example.examen_repo_2.Services.Imp.EquiposServicesImpl;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/equipos")
public class EquiposControllers {

    @Autowired
    private EquiposServicesImpl equiposServicesImpl;

    @PostMapping("crear")
    public Equipos crearEquipos(@RequestBody Equipos nuevoEquipo) {
        return this.equiposServicesImpl.crearEquipos(nuevoEquipo);
    }

    @DeleteMapping("eliminar")
    public String eliminarPorId(@RequestParam(name = "codigoequipo") int codigoEquipo) {
        return this.equiposServicesImpl.eliminarEquipos(codigoEquipo);
    }

    @GetMapping("buscar")
    public Equipos buscarEquipo(@RequestParam(name = "codigoequipo") int codigoEquipo) {
        return this.equiposServicesImpl.buscarEquipos(codigoEquipo);
    }

}
