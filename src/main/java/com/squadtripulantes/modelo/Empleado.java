package com.squadtripulantes.modelo;

import java.util.Date;

public class Empleado {
    public long id;

    public String email;

    public Perfil perfil;

    public RolEmpleo nombreEmpleo;

    public Empresa empresa;

    public Transaccion transaccion;

    public Date modificadoEn;

    public Date creadoEn;


    public Empleado(long id, String email, Perfil perfil, RolEmpleo nombreEmpleo, Empresa empresa, Transaccion transaccion, Date modificadoEn, Date creadoEn) {
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

    public Transaccion getTransaccion() {
        return transaccion;


    }

    public void setTransaccion(Transaccion transaccion) {


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
