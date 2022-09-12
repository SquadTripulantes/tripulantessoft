package com.squadtripulantes.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true)
    private long id;
	@Column(nullable = false, unique = true)
    private String email;

	@JoinColumn(name = "perfil_id")
	@OneToOne
    private Perfil perfil;
	
    @Enumerated(EnumType.STRING)
    private RolEmpleo nombreEmpleo;
    @Column(nullable = false)
    private String empresa;

    private String transaccion;
    @Column(nullable = true)
    private Date modificadoEn;
    @Column(nullable = true)
    private Date creadoEn;

	public Empleado() {
	}

	public Empleado(long id, String email, Perfil perfil, RolEmpleo nombreEmpleo, String empresa,
					String transaccion, Date modificadoEn, Date creadoEn) {
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(String transaccion) {
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

	@Override
	public String toString() {
		return "Empleado{" +
				"id=" + id +
				", email='" + email + '\'' +
				", perfil=" + perfil +
				", nombreEmpleo=" + nombreEmpleo +
				", empresa=" + empresa +
				", transaccion=" + transaccion +
				", modificadoEn=" + modificadoEn +
				", creadoEn=" + creadoEn +
				'}';
	}
}
