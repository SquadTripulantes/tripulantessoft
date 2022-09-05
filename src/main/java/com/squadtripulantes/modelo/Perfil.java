package com.squadtripulantes.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique =true)
	private String id;
	@Column(nullable = true)
	private String imagen;
	@Column(nullable = true)
	private String telefono;
//	@OneToOne
//	@JoinColumn(name = "id")
	@Column(nullable = true)
	private String usuario;
	@Column(nullable = true)
	private Date creadoEn;
	@Column(nullable = true)
	private Date modificadoEn;

    public Perfil() {
    }

    public Perfil(String id, String imagen, String telefono, String usuario, Date creadoEn, Date modificadoEn) {
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
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