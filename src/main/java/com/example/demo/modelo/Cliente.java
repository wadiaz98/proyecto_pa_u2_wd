package com.example.demo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clie_seq")
	@SequenceGenerator(name = "clie_seq", sequenceName = "clie_seq", allocationSize = 1)
	@Column(name = "clie_id")
	private Integer id;

	@Column(name = "clie_numero_cedula")
	private String numeroCedula;

	@Column(name = "clie_nombre")
	private String Nombre;

	@Column(name = "clie_apellido")
	private String apellido;

	@Column(name = "clie_edad")
	private Integer edad;

	@ManyToMany(mappedBy = "clientes", cascade = CascadeType.ALL)
	private Set<Vehiculo> vehiculos;

	// Set y Get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Set<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Set<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", numeroCedula=" + numeroCedula + ", Nombre=" + Nombre + ", apellido=" + apellido
				+ ", edad=" + edad + "]";
	}

}
