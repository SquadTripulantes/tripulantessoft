package com.squadtripulantes.repositorio;

import com.squadtripulantes.modelo.Empresa;
import com.squadtripulantes.modelo.MovimientoDinero;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoDineroRepositorio extends JpaRepository<MovimientoDinero,Long> {
	List<MovimientoDinero> findByEmpresa(Empresa empresa);
}
