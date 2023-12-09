package com.reposicion.reposicion.Servicios;

import java.util.List;

import com.reposicion.reposicion.Modelos.Equipo;
import com.reposicion.reposicion.Modelos.Posicion;

public interface PosicionService {
    
    public List<Posicion> obtenerTodos();

    public Posicion obtenerPorEquipo(Equipo equipo);

}
