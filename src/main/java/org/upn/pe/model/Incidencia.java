package org.upn.pe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "incidencias")
public class Incidencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="Falla")
	private String falla;
	
	@Column(name="Electrodomestico")
	private String electrodomestico;
	
	@Column(name="Marca")
	private String marca;
	
	@Column(name="Modelos")
	private String modelos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFalla() {
		return falla;
	}

	public void setFalla(String falla) {
		this.falla = falla;
	}

	public String getElectrodomestico() {
		return electrodomestico;
	}

	public void setElectrodomestico(String electrodomestico) {
		this.electrodomestico = electrodomestico;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelos() {
		return modelos;
	}

	public void setModelos(String modelos) {
		this.modelos = modelos;
	}
	

}
