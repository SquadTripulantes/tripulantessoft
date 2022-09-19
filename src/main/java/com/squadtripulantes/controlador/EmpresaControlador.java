package com.squadtripulantes.controlador;
import com.squadtripulantes.modelo.*;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaControlador {

    @GetMapping("/enterprise")
    public Empresa getEmpresa()
    {
        return new Empresa(0, null, null, null, null, null, null);
    }
    @PostMapping("/enterprise")
    public Empresa crearEmpresa(@RequestBody Empresa empresa)
    {
        return empresa;
    }

    @GetMapping("/enterprise/{id}")
    public Empresa consultarEmpresa(@PathVariable("id") long index)
    {
        return new Empresa();
    }

    @PatchMapping("/enterprise/{id}")
    public Empresa modificarEmpresa(@PathVariable("id") long index,@RequestBody Empresa empresa)
    {
        return  empresa;
    }
    @DeleteMapping("/enterprise/{id}")
    public boolean eliminarEmpresa(@PathVariable("id") long index)
    {
        return true;
    }
}
