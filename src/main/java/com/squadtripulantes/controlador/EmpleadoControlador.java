package com.squadtripulantes.controlador;

import com.squadtripulantes.modelo.*;
import com.squadtripulantes.repositorio.EmpleadoRepositorio;
import com.squadtripulantes.servicios.EmpleadoServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class EmpleadoControlador {
	
	@Autowired
	private EmpleadoServicio empleadoServicio;

    @GetMapping("/users")
    public List<Empleado> getEmpleado()
    {
        return this.empleadoServicio.listarEmpleados();
    }
    @PostMapping("/users")
    public Empleado crearEmpleado(@RequestBody Empleado empleado)
    {
        return this.empleadoServicio.crearEmpleado(empleado);
    }

    @GetMapping("/user/{id}")
    public Optional<Empleado> consultarEmpleado(@PathVariable("id") long id)
    {
        return this.empleadoServicio.buscarEmpleado(id);
    }

    @PatchMapping("/user/{id}")
    public Empleado modificarEmpleado(@PathVariable("id") long id, @RequestBody Empleado empleado)
    {
        return  this.empleadoServicio.actualizarEmpleado(id, empleado);
    }
    @DeleteMapping("/user/{id}")
    public boolean eliminarEmpleado(@PathVariable("id") long id)
    {
        return this.empleadoServicio.eliminarEmpleados(id);
    }
}
