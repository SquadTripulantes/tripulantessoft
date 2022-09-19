package com.squadtripulantes.controlador;


import com.squadtripulantes.modelo.Empleado;
import com.squadtripulantes.modelo.MovimientoDinero;
import com.squadtripulantes.servicios.MovimientoDineroServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MovimientoDineroControlador {


    private MovimientoDineroServicio movimiento_dinero_servicio;

    @GetMapping("/enterprises/{id}/movements")
    public List<MovimientoDinero> getMovimientoDinero()
    {
        return this.movimiento_dinero_servicio.listarMovimientos();
    }


    @PostMapping("/enterprises/{id}/movements")
    public MovimientoDinero crearMovimientoDinero(@RequestBody MovimientoDinero movimientoDinero)
    {
        return null;
    }

    @GetMapping("/enterprises/{id}/movements")
    public Optional<MovimientoDinero> consultarMovimientoDinero(@PathVariable("id") long id)
    {
        return null;
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
