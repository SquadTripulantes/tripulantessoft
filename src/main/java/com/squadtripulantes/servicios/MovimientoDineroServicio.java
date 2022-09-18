package com.squadtripulantes.servicios;

import com.squadtripulantes.modelo.Empresa;
import com.squadtripulantes.modelo.MovimientoDinero;
import com.squadtripulantes.repositorio.MovimientoDineroRepositorio;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MovimientoDineroServicio {


   private MovimientoDineroRepositorio movimientoDineroRepositorio;

    public  MovimientoDineroServicio(MovimientoDineroRepositorio movimientoDineroRepositorio) {
       this.movimientoDineroRepositorio = movimientoDineroRepositorio;
    }

    public List<MovimientoDinero> listarMovimientos()
    {
        List<MovimientoDinero> lista = null;
        try{
            lista = this.movimientoDineroRepositorio.findAll();
        }catch(Exception error)
        {
            error.printStackTrace();
        }
        return lista;
    }

    public MovimientoDinero crearMovimientoDinero(MovimientoDinero movimiento)
    {
        return this.movimientoDineroRepositorio.save(movimiento);
    }

    public Optional<MovimientoDinero> buscarMovimientoDinero(long id)
    {
        return this.movimientoDineroRepositorio.findById(id);
    }

    public MovimientoDinero actualizarMovimientodinero(long id, MovimientoDinero movimiento)
    {
        if(buscarMovimientoDinero(id).isPresent())
        {
            MovimientoDinero movimientoDineroActualizar = this.movimientoDineroRepositorio.findById(id).get();
            movimientoDineroActualizar.setModificadoEn(new Date());
            movimientoDineroActualizar.setConcepto(movimiento.getConcepto());
            movimientoDineroActualizar.setMonto(movimiento.getMonto());
            return this.movimientoDineroRepositorio.save(movimientoDineroActualizar);
        }
        else
        {
            return null;
        }

    }

    public boolean eliminarMovimientoDinero(long id)
    {
        this.movimientoDineroRepositorio.deleteById(id);
        return true;
    }



}
