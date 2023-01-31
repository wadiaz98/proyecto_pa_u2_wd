package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Autor autor = new Autor(); Autor autor2 = new Autor(); Autor autor3 = new
		 * Autor(); Autor autor4 = new Autor(); autor.setNombre("WS");
		 * autor2.setNombre("WY"); autor3.setNombre("JS"); autor4.setNombre("OM"); Libro
		 * libro = new Libro(); Libro libro2 = new Libro(); libro.setEditorial("NORMA");
		 * libro2.setEditorial("Patito"); libro.setNombre("P. Web");
		 * libro2.setNombre("Redes"); Set<Autor> autores = new HashSet<>(); Set<Autor>
		 * autores2 = new HashSet<>(); Set<Libro> libros = new HashSet<>(); Set<Libro>
		 * libros2 = new HashSet<>(); Set<Libro> libros3 = new HashSet<>();
		 * autores.add(autor); autores.add(autor4); autores2.add(autor);
		 * autores2.add(autor2); autores2.add(autor3); libros.add(libro2);
		 * libros3.add(libro); libros2.add(libro); libros2.add(libro2);
		 * autor.setLibros(libros2); autor2.setLibros(libros); autor3.setLibros(libros);
		 * autor4.setLibros(libros3); libro.setAutores(autores);
		 * libro2.setAutores(autores2); this.autorService.guardar(autor);
		 */
		Set<Vehiculo> vehiculos1 = new HashSet<>();
		Set<Vehiculo> vehiculos2 = new HashSet<>();
		Set<Vehiculo> vehiculos3 = new HashSet<>();

		Set<Cliente> clientes1 = new HashSet<>();
		Set<Cliente> clientes2 = new HashSet<>();
		Set<Cliente> clientes3 = new HashSet<>();
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setPlaca("ABC123");
		vehiculo1.setColor("Verde");
		vehiculo1.setMarca("Chevrolet");
		vehiculo1.setTipo("P");
		vehiculo1.setClientes(clientes1);
		vehiculos1.add(vehiculo1);
		vehiculos3.add(vehiculo1);

		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setPlaca("DEF456");
		vehiculo2.setColor("Rojo");
		vehiculo2.setMarca("Toyota");
		vehiculo2.setTipo("L");
		vehiculo2.setClientes(clientes2);
		vehiculos1.add(vehiculo2);
		vehiculos2.add(vehiculo2);
		vehiculos3.add(vehiculo2);

		Vehiculo vehiculo3 = new Vehiculo();
		vehiculo3.setPlaca("GHI789");
		vehiculo3.setColor("Blanco");
		vehiculo3.setMarca("Ford");
		vehiculo3.setTipo("P");
		vehiculo3.setClientes(clientes3);
		vehiculos1.add(vehiculo3);
		vehiculos2.add(vehiculo3);

		Cliente cliente1 = new Cliente();
		cliente1.setNumeroCedula("1725841538");
		cliente1.setNombre("Willan");
		cliente1.setApellido("Diaz");
		cliente1.setEdad(18);
		cliente1.setVehiculos(vehiculos1);
		clientes1.add(cliente1);
		clientes2.add(cliente1);

		Cliente cliente2 = new Cliente();
		cliente2.setNumeroCedula("1725841539");
		cliente2.setNombre("Alexander");
		cliente2.setApellido("Cordova");
		cliente2.setEdad(20);
		cliente2.setVehiculos(vehiculos2);
		clientes2.add(cliente2);
		clientes1.add(cliente2);

		Cliente cliente3 = new Cliente();
		cliente3.setNumeroCedula("1725841530");
		cliente3.setNombre("Marco");
		cliente3.setApellido("Solis");
		cliente3.setEdad(22);
		cliente3.setVehiculos(vehiculos3);
		clientes3.add(cliente3);
		clientes1.add(cliente3);

		this.vehiculoService.guardar(vehiculo1);

	}

}
