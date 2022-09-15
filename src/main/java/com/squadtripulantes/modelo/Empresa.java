package com.squadtripulantes.modelo;

import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String documento;
	@Column(nullable = true)
	private String telefono;
	@Column(nullable = true)
    private String direccion;
	
	@OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<Empleado> usuario;
	
	@OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
	private List<MovimientoDinero> movimientoDinero;
    
    @Column(nullable = true)
    private Date creadoEn;
    @Column(nullable = true)
    private Date modificadoEn;

    public Empresa() {
    }

    public Empresa(long id, String nombre, String documento, String telefono, String direccion, List<Empleado> usuario , List<MovimientoDinero>  movimientoDinero, Date creadoEn, Date modificadoEn) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<Empleado> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Empleado> usuario) {
        this.usuario = usuario;
    }

    public List<MovimientoDinero> getMovimientoDinero() {
        return movimientoDinero;
    }

    public void setMovimientoDinero(List<MovimientoDinero> movimientoDinero) {
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

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", usuario=" + usuario +
                ", movimientoDinero=" + movimientoDinero +
                ", creadoEn=" + creadoEn +
                ", modificadoEn=" + modificadoEn +
                '}';
    }
}
