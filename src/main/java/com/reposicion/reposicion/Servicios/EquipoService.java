package com.reposicion.reposicion.Servicios;

import java.util.List;

import com.reposicion.reposicion.Modelos.Equipo;

public interface EquipoService {
    
    public Equipo crearEquipo(Equipo equipo);

    public String eliminarEquipo(int codigoEquipo);

    public Equipo buscarEquipo(int codigoEquipo);

    public List<Equipo> obtenerTodos();

}
