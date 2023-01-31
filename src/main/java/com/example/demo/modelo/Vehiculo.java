package com.example.demo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_seq")
	@SequenceGenerator(name = "vehi_seq", sequenceName = "vehi_seq", allocationSize = 1)
	@Column(name = "vehi_id")
	private Integer id;

	@Column(name = "vehi_marca")
	private String marca;

	@Column(name = "vehi_placa")
	private String placa;

	@Column(name = "vehi_color")
	private String color;

	@Column(name = "vehi_tipo")
	private String tipo;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "vehiculo_cliente", joinColumns = @JoinColumn(name = "vecli_id_vehiculo"), inverseJoinColumns = @JoinColumn(name = "vecli_id_cliente"))
	private Set<Cliente> clientes;

	// Set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", marca=" + marca + ", placa=" + placa + ", color=" + color + ", tipo=" + tipo
				+ "]";
	}

}
