package com.reposicion.reposicion.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reposicion.reposicion.Modelos.Posicion;
import com.reposicion.reposicion.Repositorios.PosicionRepository;
import com.reposicion.reposicion.Servicios.PosicionService;

@Service
public class PosicionServiceImpl implements PosicionService{

    @Autowired
    private PosicionRepository posicionRepository;

    @Override
    public List<Posicion> obtenerTodos() {
        return this.posicionRepository.findAll();
    }
    
}
