package com.squadtripulantes.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true)
    private long id;
	
	@Column(nullable = false, unique = true)
    private String email;


    @Enumerated(EnumType.STRING)	
    @Column(nullable = false)
    private RolEmpleado rolEmpleado;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;
	        
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Empresa empresa;

//    @OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY)
//    private List<MovimientoDinero> transaccion;
        
    @Column(nullable = true)
    private Date modificadoEn;
    @Column(nullable = true)
    private Date creadoEn;

	public Empleado() {
	}

	

	public Empleado(long id, String email, Perfil perfil, RolEmpleado rolEmpleado, Empresa empresa,
			 Date modificadoEn, Date creadoEn) {		
		this.id = id;
		this.email = email;
		this.perfil = perfil;
		this.rolEmpleado = rolEmpleado;
		this.empresa = empresa;
		//this.transaccion = transaccion;
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

	public RolEmpleado getRolEmpleado() {
		return rolEmpleado;
	}

	public void setRolEmpleado(RolEmpleado rolEmpleado) {
		this.rolEmpleado = rolEmpleado;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

//	public List<MovimientoDinero> getTransaccion() {
//		return transaccion;
//	}
//
//	public void setTransaccion(List<MovimientoDinero> transaccion) {
//		this.transaccion = transaccion;
//	}

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
				", nombreEmpleo=" + rolEmpleado +				
				//", transaccion=" + transaccion +
				", modificadoEn=" + modificadoEn +
				", creadoEn=" + creadoEn +
				'}';
	}
}
