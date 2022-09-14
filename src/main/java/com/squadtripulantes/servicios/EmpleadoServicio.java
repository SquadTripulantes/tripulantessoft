package com.squadtripulantes.servicios;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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
		 List<Empleado> listaD = null;
		 try {
			 listaD = this.empleadoRepositorio.findAll();	
		} catch (Exception e) {
			System.out.println(e);
		}
		 return listaD;
	 }
	 
	 public Empleado crearEmpleado(Empleado empleado) {
		 return this.empleadoRepositorio.save(empleado);
	 }
	 
	 public Optional<Empleado> buscarEmpleado(long id) {
		 return this.empleadoRepositorio.findById(id);
	 }
	 
	 public Empleado actualizarEmpleado(long id, Empleado empleado) {
		 if(buscarEmpleado(id).isPresent()) {
			 Empleado empleadoActualizar =  this.empleadoRepositorio.findById(id).get();
			 empleadoActualizar.setModificadoEn(new Date());
			 empleadoActualizar.setRolEmpleado(empleado.getRolEmpleado());
			 empleadoActualizar.setEmail(empleado.getEmail());
			 return this.empleadoRepositorio.save(empleadoActualizar);
		 }else {
			return null; 
		 }
	 }
	 
	 public boolean eliminarEmpleados(long id) {
		 this.empleadoRepositorio.deleteById(id);
		 return true;
	 }
}
