package com.squadtripulantes.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squadtripulantes.modelo.Empleado;
import com.squadtripulantes.servicios.EmpleadoServicio;

@RestController
public class EmpresaControlador {

	private EmpleadoServicio empleadoServicio;
	public EmpresaControlador(EmpleadoServicio empleadoServicio) {
		this.empleadoServicio = empleadoServicio;
	}
	
	@GetMapping("/users")
	public List<Empleado> listarEmpleados(){
		return this.empleadoServicio.listarEmpleados();
	}
	
	@PostMapping
	public Empleado guardarEmpleado(Empleado empleado) {
		return this.empleadoServicio.crearEmpleado(empleado);
	}
}
