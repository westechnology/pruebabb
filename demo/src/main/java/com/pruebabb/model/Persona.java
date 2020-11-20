package com.pruebabb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {

	@Id
	@Column(name="numero_ide")
	private String numeroIde;
	
	@Column(name="tipo_ide")
	private String tipoIde;
	
	@Column(name="primer_nombre")
	private String primerNombre;
	
	@Column(name="segundo_nombre")
	private String segundoNombre;
	
	@Column(name="primer_apellido")
	private String primerApellido;
	
	@Column(name="segundo_apellido")
	private String segundoApellido;
	
	@Column(name="rol")
	private String rol;

	public String getNumeroIde() {
		return numeroIde;
	}

	public void setNumeroIde(String numeroIde) {
		this.numeroIde = numeroIde;
	}

	public String getTipoIde() {
		return tipoIde;
	}

	public void setTipoIde(String tipoIde) {
		this.tipoIde = tipoIde;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	
	
}
