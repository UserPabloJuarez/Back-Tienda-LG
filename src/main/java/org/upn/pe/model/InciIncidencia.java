package org.upn.pe.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "incidencia")
public class InciIncidencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idIncidencia")
	private int idIncidencia;
	
	@Column(name="idAnalista")
	private int idAnalista;
	
	@Column(name="idCliente")
	private int idCliente;
	
	@Column(name="idProducto")
	private int idProducto;
	
	@Column(name="tipoFalla")
	private String falla;
	
	@Column(name="descripcionFalla")
	private String descripcionFalla;
	
	@Column(name="fecReg")
	private Date fecReg;
	
	@Column(name="fecMod")
	private Date fecMod;
	
	@Column(name="fecCierre")
	private Date fecCierre;
	
	@Column(name="garantia")
	private String garantia;
	
	@Column(name="delivery")
	private String delivery;
	
	@Column(name="estIncidencia")
	private String estIncidencia;

	public int getIdIncidencia() {
		return idIncidencia;
	}

	public void setIdIncidencia(int idIncidencia) {
		this.idIncidencia = idIncidencia;
	}

	public int getIdAnalista() {
		return idAnalista;
	}

	public void setIdAnalista(int idAnalista) {
		this.idAnalista = idAnalista;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getFalla() {
		return falla;
	}

	public void setFalla(String falla) {
		this.falla = falla;
	}

	public String getDescripcionFalla() {
		return descripcionFalla;
	}

	public void setDescripcionFalla(String descripcionFalla) {
		this.descripcionFalla = descripcionFalla;
	}

	public Date getFecReg() {
		return fecReg;
	}

	public void setFecReg(Date fecReg) {
		this.fecReg = fecReg;
	}

	public Date getFecMod() {
		return fecMod;
	}

	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}

	public Date getFecCierre() {
		return fecCierre;
	}

	public void setFecCierre(Date fecCierre) {
		this.fecCierre = fecCierre;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public String getDelivery() {
		return delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getEstIncidencia() {
		return estIncidencia;
	}

	public void setEstIncidencia(String estIncidencia) {
		this.estIncidencia = estIncidencia;
	}
	
	
	
}
