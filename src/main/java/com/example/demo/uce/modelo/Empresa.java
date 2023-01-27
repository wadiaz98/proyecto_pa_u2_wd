package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {

	@Id
	@Column(name = "empr_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empr_seq")
	@SequenceGenerator(name = "empr_seq", sequenceName = "empr_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "empr_ubicacion")
	private String ubicacion;

	@Column(name = "empr_nombre")
	private String nombre;

	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
	private List<Empleado> empleado;

	// Set y gety
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", ubicacion=" + ubicacion + ", nombre=" + nombre + ", empleado=" + empleado + "]";
	}

}
