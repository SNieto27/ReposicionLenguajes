package com.reposicion.reposicion.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reposicion.reposicion.Modelos.Equipo;
import com.reposicion.reposicion.Repositorios.EquipoRepository;
import com.reposicion.reposicion.Repositorios.PosicionRepository;
import com.reposicion.reposicion.Servicios.EquipoService;

@Service
public class EquipoServiceImpl implements EquipoService {

    @Autowired
    private PosicionRepository posicionRepository;
    
    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public Equipo crearEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public String eliminarEquipo(int codigoEquipo) {
        Equipo equipoEliminar = this.equipoRepository.findById(codigoEquipo).get();

        if (equipoEliminar != null) {
            if (!posicionRepository.existsById(codigoEquipo)) {
                this.equipoRepository.delete(equipoEliminar);
                return "Equipo Eliminado";
            }
        }

        return "Equipo a eliminar no encontrado";
    }

    @Override
    public Equipo buscarEquipo(int codigoEquipo) {
        return this.equipoRepository.findById(codigoEquipo).get();
    }

    @Override
    public List<Equipo> obtenerTodos() {
        return this.equipoRepository.findAll();
    }
    
}
