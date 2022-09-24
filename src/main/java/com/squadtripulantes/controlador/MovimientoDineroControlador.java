package com.squadtripulantes.controlador;


import com.squadtripulantes.modelo.Empleado;
import com.squadtripulantes.modelo.MovimientoDinero;
import com.squadtripulantes.servicios.MovimientoDineroServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MovimientoDineroControlador {

	@Autowired
    private MovimientoDineroServicio movimiento_dinero_servicio;

    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero> getMovimientoDinero(@PathVariable ("id") long id)
    {
        return this.movimiento_dinero_servicio.listarMovimientos(id);
    }


    @PostMapping("/enterprises/{id}/movements")
    public MovimientoDinero crearMovimientoDinero(@PathVariable("id") long id, @RequestBody MovimientoDinero movimientoDinero)
    {
        return this.movimiento_dinero_servicio.crearMovimientoDinero(id,movimientoDinero);
    }

    @PatchMapping("/enterprises/{id}/movements")
    public MovimientoDinero modificarMovimientoDinero(@PathVariable("id") long id, @RequestBody MovimientoDinero MovimientoDinero)
    {
        return  null;
    }

    @DeleteMapping("/enterprises/{id}/movements")
    public boolean eliminarMovimientoDinero(@PathVariable("id") long id)
    {
        return true;
    }

}
