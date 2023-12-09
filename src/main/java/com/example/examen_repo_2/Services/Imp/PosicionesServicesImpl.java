package com.example.examen_repo_2.Services.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen_repo_2.Models.Posiciones;
import com.example.examen_repo_2.Repositories.PosicionesRepository;
import com.example.examen_repo_2.Services.PosicionesServices;

@Service
public class PosicionesServicesImpl implements PosicionesServices {

    @Autowired
    private PosicionesRepository posicionesRepository;

    @Override
    public List<Posiciones> obtenerTablaPosiciones() {
        return this.posicionesRepository.findAll();
    }

}
