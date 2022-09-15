package com.squadtripulantes.modelo;

import java.util.Date;

import javax.persistence.CascadeType;
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
	private long id;
	@Column(nullable = true)
	private String imagen;
	@Column(nullable = true)
	private String telefono;
		
	//@OneToOne(mappedBy = "usuario")
	//private Empleado usuario;
	
	@Column(nullable = true)
	private Date creadoEn;
	@Column(nullable = true)
	private Date modificadoEn;

    public Perfil() {
    }

    public Perfil(long id, String imagen, String telefono, Date creadoEn, Date modificadoEn) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
        this.creadoEn = creadoEn;
        this.modificadoEn = modificadoEn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
                ", creadoEn=" + creadoEn +
                ", modificadoEn=" + modificadoEn +
                '}';
    }
}