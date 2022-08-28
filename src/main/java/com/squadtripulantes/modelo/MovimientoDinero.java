package com.squadtripulantes.modelo;

import java.util.Date;

public class MovimientoDinero {
    public long String ;
    public String concepto;
    public float monto;
    public Empleado usuario;
    public  Empresa empresa;
    public Date creadoEn;
    public Date modificadoEn;

    public MovimientoDinero(long string, java.lang.String concepto, float monto, Empleado usuario, Empresa empresa, Date creadoEn, Date modificadoEn) {
        String = string;
        this.concepto = concepto;
        this.monto = monto;
        this.usuario = usuario;
        this.empresa = empresa;
        this.creadoEn = creadoEn;
        this.modificadoEn = modificadoEn;
    }

    public long getString() {
        return String;
    }

    public void setString(long string) {
        String = string;
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
