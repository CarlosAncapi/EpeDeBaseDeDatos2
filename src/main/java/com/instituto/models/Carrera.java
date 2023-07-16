package com.instituto.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Carreras")
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod_car;
	private String nom_car;
	
	public Carrera() {
		super();
	}

	public int getCod_car() {
		return cod_car;
	}

	public void setCod_car(int cod_car) {
		this.cod_car = cod_car;
	}

	public String getNom_car() {
		return nom_car;
	}

	public void setNom_car(String nom_car) {
		this.nom_car = nom_car;
	}
	
}
