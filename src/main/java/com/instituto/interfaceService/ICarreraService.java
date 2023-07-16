package com.instituto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.instituto.models.Carrera;

public interface ICarreraService {
	
	public List<Carrera> listarCarreras();
	public Optional<Carrera> listarPorNombre(String nombre);
	public int save(Carrera carrera);
	public void delete(String nombre);
	
}
