package com.squadtripulantes.repositorio;
import com.squadtripulantes.modelo.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa,Long> { }
