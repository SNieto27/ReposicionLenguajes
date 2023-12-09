package com.reposicion.reposicion.Controladores;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reposicion.reposicion.Modelos.Equipo;
import com.reposicion.reposicion.Modelos.Posicion;
import com.reposicion.reposicion.Repositorios.PosicionRepository;
import com.reposicion.reposicion.Servicios.Impl.EquipoServiceImpl;
import com.reposicion.reposicion.Servicios.Impl.PosicionServiceImpl;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionController {

    @Autowired
    private PosicionRepository posicionRepository;
    
    @Autowired
    private PosicionServiceImpl posicionServiceImpl;

    @Autowired
    private EquipoServiceImpl equipoServiceImpl;

    @GetMapping("/todos")
    public List<Posicion> obtenerTodos(){
        return this.posicionServiceImpl.obtenerTodos();
    }

    @GetMapping("/simular")
    public String simularPartidos(){

        List<Equipo> listaEquipos = this.equipoServiceImpl.obtenerTodos();

        if (validarCantidadEquipos(listaEquipos)) {


            
            return "Simulacion completada";
        }

        crearEquiposFaltantes();



        return "Simulacion completada con equipos de relleno";
    }

    public boolean validarCantidadEquipos(List<Equipo> listaEquipos){
        return listaEquipos != null && listaEquipos.size() >= 6;
    }

    public void crearEquiposFaltantes(){
        List<Equipo> listaEquipos = this.equipoServiceImpl.obtenerTodos();

        if (!validarCantidadEquipos(listaEquipos)) {
            int equiposFaltantes = 6 - listaEquipos.size();

            for (int i = 0; i < equiposFaltantes; i++){
                Equipo nvoEquipo = new Equipo();
                nvoEquipo.setNombre("Equipo "+ (i+1));
                nvoEquipo.setAtaque(80);
                nvoEquipo.setDefensa(80);
                this.equipoServiceImpl.crearEquipo(nvoEquipo);
            }
        }

    }

    public void jugarPartidos(List<Equipo> listaEquipos){
        Random random = new Random();

        for (Equipo equipo : listaEquipos){
            for (Equipo rival : listaEquipos){
                int golesEquipo = random.nextInt(7)+1;
                int golesRival = random.nextInt(7)+1;


            }
        }
    }

    public void actualizarPosicion(Equipo equipo, Equipo rival, int golesEquipo, int golesRival){
        
        Posicion posicionEquipo = new Posicion();
        Posicion posicionRival = new Posicion();

        posicionEquipo.setEquipo(equipo);
        posicionRival.setEquipo(rival);

        if (golesEquipo > golesRival) {
            
        }

    }

}
