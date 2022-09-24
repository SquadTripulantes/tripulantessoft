package com.squadtripulantes.controlador;
import com.squadtripulantes.modelo.*;
import com.squadtripulantes.servicios.EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaControlador {

    @Autowired
    private EmpresaServicio empresaServicio;

    @GetMapping("/enterprises")
    public List<Empresa> getEmpresa()
    {
        return this.empresaServicio.listarEmpresas();
    }
    @PostMapping("/enterprises")
    public Empresa crearEmpresa(@RequestBody Empresa empresa)
    {
        return this.empresaServicio.crearEmpresa(empresa);
    }
    @GetMapping("/enterprises/{id}")
    public Optional<Empresa> consultarEmpresa(@PathVariable("id") long id)
    {
        return this.empresaServicio.buscarEmpresa(id);
    }
    @PatchMapping("/enterprises/{id}")
    public Empresa modificarEmpresa(@PathVariable("id") long id,@RequestBody Empresa empresa)
    {
        return  this.empresaServicio.actualizarEmpresa(id, empresa);
    }
    @DeleteMapping("/enterprises/{id}")
    public boolean eliminarEmpresa(@PathVariable("id") long id)
    {
        return this.empresaServicio.eliminarEmpresa(id);
    }
}
