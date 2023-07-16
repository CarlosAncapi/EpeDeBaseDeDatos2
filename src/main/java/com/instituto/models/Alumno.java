package com.instituto.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alumno")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String rut;
	private String nom_alu;
	private Date fec_nac;
	private String genero;
	
	public Alumno() {
		super();
	}

	public Alumno(int id, String rut, String nom_alu, Date fec_nac, String genero) {
		super();
		this.id = id;
		this.rut = rut;
		this.nom_alu = nom_alu;
		this.fec_nac = fec_nac;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNom_alu() {
		return nom_alu;
	}

	public void setNom_alu(String nom_alu) {
		this.nom_alu = nom_alu;
	}

	public Date getFec_nac() {
		return fec_nac;
	}

	public void setFec_nac(Date fec_nac) {
		this.fec_nac = fec_nac;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
