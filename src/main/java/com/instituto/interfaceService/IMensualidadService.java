package com.instituto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.instituto.models.Mensualidad;

public interface IMensualidadService {
	
	public List<Mensualidad> listarmensualidad();
	public List<Mensualidad> listarMensualidadPorRut(String Rut);
	public int save(Mensualidad mensualidad);
	public void delete(String rut);

}
