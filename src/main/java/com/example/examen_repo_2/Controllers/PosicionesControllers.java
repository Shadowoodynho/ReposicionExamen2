package com.example.examen_repo_2.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen_repo_2.Models.Posiciones;
import com.example.examen_repo_2.Services.Imp.PosicionesServicesImpl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionesControllers {

    private PosicionesServicesImpl posicionesServicesImpl;

    @GetMapping("obtenertabla")
    public List<Posiciones> obtenerPosiciones() {
        return this.posicionesServicesImpl.obtenerTablaPosiciones();
    }

}
