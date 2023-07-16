package com.instituto.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mensualidad")
public class Mensualidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int folio;
	private Date fecha_pago;
	private int valor_cuota;
	private int cod_car;
	private String rut;
	
	public Mensualidad() {
		super();
	}

	public Mensualidad(int folio, Date fecha_pago, int valor_cuota, int cod_car, String rut) {
		super();
		this.folio = folio;
		this.fecha_pago = fecha_pago;
		this.valor_cuota = valor_cuota;
		this.cod_car = cod_car;
		this.rut = rut;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public int getValor_cuota() {
		return valor_cuota;
	}

	public void setValor_cuota(int valor_cuota) {
		this.valor_cuota = valor_cuota;
	}

	public int getCod_car() {
		return cod_car;
	}

	public void setCod_car(int cod_car) {
		this.cod_car = cod_car;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
}
