package com.squadtripulantes.modelo;

import java.util.Date;
import java.util.List;

public class Empleado {
    private long id;

    private String email;

    private Perfil perfil;

    private RolEmpleo nombreEmpleo;

    private Empresa empresa;

    private List<MovimientoDinero> transaccion;

    private Date modificadoEn;

    private Date creadoEn;

    
	public Empleado(long id, String email, Perfil perfil, RolEmpleo nombreEmpleo, Empresa empresa,
			List<MovimientoDinero> transaccion, Date modificadoEn, Date creadoEn) {
		this.id = id;
		this.email = email;
		this.perfil = perfil;
		this.nombreEmpleo = nombreEmpleo;
		this.empresa = empresa;
		this.transaccion = transaccion;
		this.modificadoEn = modificadoEn;
		this.creadoEn = creadoEn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public RolEmpleo getNombreEmpleo() {
		return nombreEmpleo;
	}

	public void setNombreEmpleo(RolEmpleo nombreEmpleo) {
		this.nombreEmpleo = nombreEmpleo;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<MovimientoDinero> getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(List<MovimientoDinero> transaccion) {
		this.transaccion = transaccion;
	}

	public Date getModificadoEn() {
		return modificadoEn;
	}

	public void setModificadoEn(Date modificadoEn) {
		this.modificadoEn = modificadoEn;
	}

	public Date getCreadoEn() {
		return creadoEn;
	}

	public void setCreadoEn(Date creadoEn) {
		this.creadoEn = creadoEn;
	}


  
}
