package com.instituto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instituto.interfaceService.IAlumnoService;
import com.instituto.models.Alumno;
import com.instituto.repositories.IAlumno;

@Service
public class AlumnoService implements IAlumnoService {

	@Autowired
	private IAlumno data;

	@Override
	public List<Alumno> listarAlumnos() {
		// TODO Auto-generated method stub
		return (List<Alumno>) data.findAll();
	}

	@Override
	public Optional<Alumno> listarPorRut(String rut) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Alumno alumno) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String rut) {
		// TODO Auto-generated method stub
		
	}

}
