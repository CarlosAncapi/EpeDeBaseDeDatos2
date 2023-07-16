package com.instituto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instituto.interfaceService.ICarreraService;
import com.instituto.models.Carrera;
import com.instituto.repositories.ICarrera;

@Service
public class CarreraService implements ICarreraService {
	
	@Autowired
	private ICarrera data;
	
	@Override
	public List<Carrera> listarCarreras() {
		// TODO Auto-generated method stub
		return (List<Carrera>) data.findAll();
	}

	@Override
	public Optional<Carrera> listarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Carrera c) {
		int respuesta=0;
		Carrera carrera=data.save(c);
		if( !carrera.equals(null) ) {
			respuesta=1;
		}
		return respuesta;
	}

	@Override
	public void delete(String nombre) {
		// TODO Auto-generated method stub
		
	}

}
