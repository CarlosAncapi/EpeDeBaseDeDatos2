package com.instituto.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instituto.models.Mensualidad;

@Repository
public interface IMensualidad extends CrudRepository<Mensualidad, String> {

	List<Mensualidad> findByRut(String rut);
}
