package com.squadtripulantes.modelo;

import java.util.Date;

public class Perfil {
	private String id;
	private String imagen;
	private String telefono;
	private Empleado usuario;
	private Date creadoEn;
	private Date modificadoEn;

    public Perfil() {
    }

    public Perfil(String id, String imagen, String telefono, Empleado usuario, Date creadoEn, Date modificadoEn) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
        this.usuario = usuario;
        this.creadoEn = creadoEn;
        this.modificadoEn = modificadoEn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
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

    @Override
    public String toString() {
        return "Perfil{" +
                "id='" + id + '\'' +
                ", imagen='" + imagen + '\'' +
                ", telefono='" + telefono + '\'' +
                ", usuario=" + usuario +
                ", creadoEn=" + creadoEn +
                ", modificadoEn=" + modificadoEn +
                '}';
    }
}