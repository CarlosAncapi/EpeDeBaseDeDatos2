package com.instituto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.instituto.models.Alumno;

public interface IAlumnoService {

	public List<Alumno> listarAlumnos();
	public Optional<Alumno> listarPorRut(String rut);
	public int save(Alumno alumno);
	public void delete(String rut);
}
