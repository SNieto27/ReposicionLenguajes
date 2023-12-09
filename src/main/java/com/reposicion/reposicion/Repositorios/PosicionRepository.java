package com.reposicion.reposicion.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reposicion.reposicion.Modelos.Posicion;

public interface PosicionRepository extends JpaRepository<Posicion, Integer> {
    
}
