package com.instituto.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instituto.models.Carrera;

@Repository
public interface ICarrera extends CrudRepository<Carrera, String> {

}
