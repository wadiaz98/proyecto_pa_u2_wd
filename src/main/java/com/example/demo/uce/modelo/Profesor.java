package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cualquiera")
	@SequenceGenerator(name = "cualquiera", sequenceName = "profe_seq", allocationSize = 1)
	@Column(name = "profe_id")
	private Integer id;

	@Column(name = "profe_nombre")
	private String nombre;

	@Column(name = "profe_apellido")
	private String apellido;

	@Column(name = "profe_genero")
	private String genero;

	@Column(name = "profe_cedula")
	private String cedula;

	@Column(name = "profe_asignatura")
	private String asignatura;

	// Set y get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
}
