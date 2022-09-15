package com.squadtripulantes.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movimientoDinero")
public class MovimientoDinero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	
	@Column(nullable = false)
	private String concepto;
	@Column(nullable = false)
	private float monto;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "empleado_id", referencedColumnName = "id", nullable = false)
	private Empleado empleado;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "empresa_id", referencedColumnName = "id", nullable = false)
	private  Empresa empresa;
	
	@Column(nullable = true)
	private Date creadoEn;
	@Column(nullable = true)
	private Date modificadoEn;
  
    public MovimientoDinero() {
    }

    public MovimientoDinero(long id, java.lang.String concepto, float monto, Empleado usuario, Empresa empresa , Date creadoEn, Date modificadoEn) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
        this.empleado = usuario;
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
        return empleado;
    }

    public void setUsuario(Empleado usuario) {
        this.empleado = usuario;
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

    @Override
    public java.lang.String toString() {
        return "MovimientoDinero{" +
                "id=" + id +
                ", concepto='" + concepto + '\'' +
                ", monto=" + monto +
                ", usuario=" + empleado +
                ", empresa=" + empresa +
                ", creadoEn=" + creadoEn +
                ", modificadoEn=" + modificadoEn +
                '}';
    }
}
