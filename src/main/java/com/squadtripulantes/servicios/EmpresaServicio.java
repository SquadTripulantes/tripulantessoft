package com.squadtripulantes.servicios;

import com.squadtripulantes.modelo.Empresa;
import com.squadtripulantes.repositorio.EmpresaRepositorio;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServicio {

    private EmpresaRepositorio empresa_repositorio;

    public EmpresaServicio(EmpresaRepositorio empresa_repositorio)
    {
        this.empresa_repositorio = empresa_repositorio;
    }

    public List<Empresa> listarEmpresas()
    {
        List<Empresa> lista = null;
        try{
            lista = this.empresa_repositorio.findAll();
        }catch(Exception error)
        {
            error.printStackTrace();
        }
        return lista;
    }

    public Empresa crearEmpresa(Empresa empresa)
    {
        return this.empresa_repositorio.save(empresa);
    }

    public Optional<Empresa> buscarEmpresa(long id)
    {
        return this.empresa_repositorio.findById(id);
    }

    public Empresa actualizarEmpresa(long id, Empresa empresa)
    {
        if(buscarEmpresa(id).isPresent())
        {
            Empresa empresaActualizar = this.empresa_repositorio.findById(id).get();
            empresaActualizar.setModificadoEn(new Date());
            empresaActualizar.setDireccion(empresa.getDireccion());
            empresaActualizar.setTelefono(empresa.getTelefono());
            empresaActualizar.setNombre(empresa.getNombre());
            return this.empresa_repositorio.save(empresaActualizar);
        }
        else
        {
            return null;
        }

    }

    public boolean eliminarEmpresa(long id) {
        this.empresa_repositorio.deleteById(id);
        return true;
    }





}
