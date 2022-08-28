package com.squadtripulantes.modelo;

import java.util.Date;

public class Empresa {
    public String id;
    public String nombre;
    public String documento;
    public String telefono;
    public String direccion;
    public Empleado usuario;

    public  MovimientoDinero [] movimientoDinero;
    public Date creadoEn;
    public Date modificadoEn;


    public Empresa(String id, String nombre, String documento, String telefono, String direccion, Empleado usuario, MovimientoDinero [] movimientoDinero, Date creadoEn, Date modificadoEn) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.direccion = direccion;
        this.usuario = usuario;
        this.movimientoDinero = movimientoDinero;
        this.creadoEn = creadoEn;
        this.modificadoEn = modificadoEn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public MovimientoDinero[] getMovimientoDinero() {
        return movimientoDinero;
    }

    public void setMovimientoDinero(MovimientoDinero[] movimientoDinero) {
        this.movimientoDinero = movimientoDinero;
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
