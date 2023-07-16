package com.instituto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.instituto.interfaceService.IAlumnoService;
import com.instituto.interfaceService.ICarreraService;
import com.instituto.interfaceService.IMensualidadService;
import com.instituto.models.Alumno;
import com.instituto.models.Carrera;
import com.instituto.models.Mensualidad;


@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IAlumnoService servAlumn;
	
	@Autowired
	private ICarreraService servCarre;
	
	@Autowired
	private IMensualidadService mensServ;
	
	@GetMapping("/listarAlumnos")
	public String listarAlumnos(Model model) {
		List<Alumno> alumnos = servAlumn.listarAlumnos();
		model.addAttribute("alumnos", alumnos);
		return "listarAlumnos";
	}
	
	@GetMapping("/nuevaCarrera")
	public String agregarCarrera(Model model) {
		model.addAttribute("carrera", new Carrera());
		return "nuevaCarrera";
	}
	
	@PostMapping("/guardarCarrera")
	public String save(@Validated Carrera carrera, Model model){
		servCarre.save(carrera);
		return "redirect:/listarCarreras";
	}
	
	@GetMapping("/listarCarreras")
	public String listarCarreras(Model model) {
		List<Carrera> carreras = servCarre.listarCarreras();
		model.addAttribute("carreras", carreras);
		return "listarCarreras";
	}
	
	@GetMapping("/historialMensualidad/{rut}")
	public String listarMensualidades(@PathVariable String rut,Model model) {
		List<Mensualidad> mensualidades = mensServ.listarMensualidadPorRut(rut);
		model.addAttribute("mensualidades", mensualidades);
		return "historialMensualidades";
	}
	
}
