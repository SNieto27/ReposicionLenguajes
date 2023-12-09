package com.reposicion.reposicion.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.reposicion.reposicion.Modelos.Equipo;
import com.reposicion.reposicion.Modelos.Posicion;

public interface PosicionRepository extends JpaRepository<Posicion, Integer> {
    Posicion findByEquipo(@Param("equipo") Equipo equipo);
}
