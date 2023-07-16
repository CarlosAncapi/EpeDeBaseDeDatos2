package com.instituto.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.instituto.models.Alumno;

@Repository
public interface IAlumno extends CrudRepository<Alumno, String > {

}
