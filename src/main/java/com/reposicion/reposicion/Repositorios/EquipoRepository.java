package com.reposicion.reposicion.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reposicion.reposicion.Modelos.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Integer> {
    
}
