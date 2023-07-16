package com.instituto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instituto.interfaceService.IMensualidadService;
import com.instituto.models.Mensualidad;
import com.instituto.repositories.IMensualidad;

@Service
public class MensualidadService implements IMensualidadService {
	
	@Autowired
	private IMensualidad data;

	@Override
	public List<Mensualidad> listarmensualidad() {
		// TODO Auto-generated method stub
		return (List<Mensualidad>) data.findAll();
	}

	@Override
	public List<Mensualidad> listarMensualidadPorRut(String rut) {
		return data.findByRut(rut);
	}

	@Override
	public int save(Mensualidad mensualidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String rut) {
		// TODO Auto-generated method stub
		
	}

}
