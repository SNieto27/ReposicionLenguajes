package com.reposicion.reposicion.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reposicion.reposicion.Modelos.Equipo;
import com.reposicion.reposicion.Servicios.Impl.EquipoServiceImpl;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {
    
    @Autowired
    private EquipoServiceImpl equipoServiceImpl;

    @PostMapping("/crear")
    public Equipo crearEquipo(@RequestBody Equipo nvoEquipo){
        return this.equipoServiceImpl.crearEquipo(nvoEquipo);
    }

    @GetMapping("/todos")
    public List<Equipo> obtenerTodos(){
        return this.equipoServiceImpl.obtenerTodos();
    }

    @GetMapping("/buscar/{codigoEquipo}")
    public Equipo buscarEquipo(@PathVariable(name = "codigoEquipo") int codigoEquipo){
        return this.equipoServiceImpl.buscarEquipo(codigoEquipo);
    }

    @DeleteMapping("/eliminar/{codigoEquipo}")
    public String eliminarEquipo(@PathVariable(name = "codigoEquipo") int codigoEquipo){
        return this.equipoServiceImpl.eliminarEquipo(codigoEquipo);
    }
    
}
