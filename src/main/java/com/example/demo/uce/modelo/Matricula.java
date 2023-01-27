package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matri_seq")
	@SequenceGenerator(name = "matri_seq", sequenceName = "matri_seq", allocationSize = 1)
	@Column(name = "matri_id")
	private Integer id;

	@Column(name = "matri_numero")
	private String numero;

	@Column(name = "matri_propietario")
	private String propietario;

	@OneToOne()
	@JoinColumn(name = "matri_id_vehi")
	private Vehiculo vehiculo;

	// Set y get

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", numero=" + numero + ", propietario=" + propietario + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
