package com.squadtripulantes.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.squadtripulantes.modelo.MovimientoDinero;
import com.squadtripulantes.servicios.MovimientoDineroServicio;

@Controller
@RequestMapping("/")
public class ControladorVista {
	
	@Autowired
	private MovimientoDineroServicio movimientoDineroServicio;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String paginaPrincipal() {		
		return "index";
	}
	
	@RequestMapping(value = "/movimientos-de-dinero", method = RequestMethod.GET)
	public String consultarTodosLosMovimientosDinero(Model model) {
		List<MovimientoDinero> listaMovimientos = this.movimientoDineroServicio.listarMovimientos(42L);
		model.addAttribute("movimientos", listaMovimientos);
		return "listaMovimientoDinero";
	}
	
	@RequestMapping(value = "/form-movimiento-de-dinero", method = RequestMethod.GET)
	public String crearMovimientosDinero(Model model) {
		 model.addAttribute("movimientodinero",new MovimientoDinero());
		return "crearMovimientoDinero";
	}
	
	@RequestMapping(value = "/crear-movimiento-de-dinero", method = RequestMethod.POST)
	public String crearMovimientosDinero(@ModelAttribute("movimientodinero") MovimientoDinero movimientodinero, Model model, RedirectAttributes attributes) {
		
		movimientoDineroServicio.crearMovimientoDinero(42L, movimientodinero);
		return "listaMovimientoDinero";
	}
	
	
		
}
