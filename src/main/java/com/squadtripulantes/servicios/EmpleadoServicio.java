package com.squadtripulantes.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.squadtripulantes.modelo.Empleado;
import com.squadtripulantes.repositorio.EmpleadoRepositorio;

@Service
public class EmpleadoServicio{
	 private EmpleadoRepositorio empleadoRepositorio;
	 
	 
	 public EmpleadoServicio (EmpleadoRepositorio repositorio) {
		 this.empleadoRepositorio = repositorio;
	 }
	 
	 public List<Empleado> listarEmpleados(){
		 return this.empleadoRepositorio.findAll();
	 }
	 
	 public Empleado crearEmpleado(Empleado empleado) {
		 return this.empleadoRepositorio.save(empleado);
	 }
}
