package com.squadtripulantes.modelo;

import java.util.Date;

public class MovimientoDinero {
	private long id ;
	private String concepto;
	private float monto;
	private Empleado usuario;
	private  Empresa empresa;
	private Date creadoEn;
	private Date modificadoEn;

    public MovimientoDinero(long id, java.lang.String concepto, float monto, Empleado usuario, Empresa empresa, Date creadoEn, Date modificadoEn) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
        this.usuario = usuario;
        this.empresa = empresa;
        this.creadoEn = creadoEn;
        this.modificadoEn = modificadoEn;
    }

    public long getString() {
        return id;
    }

    public void setString(long id) {
        this.id = id;
    }

    public java.lang.String getConcepto() {
        return concepto;
    }

    public void setConcepto(java.lang.String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Date creadoEn) {
        this.creadoEn = creadoEn;
    }

    public Date getModificadoEn() {
        return modificadoEn;
    }

    public void setModificadoEn(Date modificadoEn) {
        this.modificadoEn = modificadoEn;
    }
}
