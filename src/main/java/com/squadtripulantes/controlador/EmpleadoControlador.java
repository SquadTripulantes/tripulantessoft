package com.squadtripulantes.controlador;

import com.squadtripulantes.modelo.*;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class EmpleadoControlador {

    @GetMapping("/users")
    public Empleado getEmpleado()
    {
        return new Empleado(0, null, null, null, null,
            null, null,null);
    }
    @PostMapping("/users")
    public Empleado crearEmpleado(@RequestBody Empleado empleado)
    {
        return empleado;
    }

    @GetMapping("/user/{id}")
    public Empleado consultarEmpleado(@PathVariable("id") long index)
    {
        return new Empleado();
    }

    @PatchMapping("/user/{id}")
    public Empleado modificarEmpleado(@PathVariable("id") long index,@RequestBody Empleado empleado)
    {
        return  empleado;
    }
    @DeleteMapping("/user/{id}")
    public boolean eliminarEmpleado(@PathVariable("id") long index)
    {
        return true;
    }
}
