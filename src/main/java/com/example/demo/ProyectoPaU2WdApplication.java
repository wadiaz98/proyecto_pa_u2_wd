package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Matricula;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.service.IMatriculaService;
import com.example.demo.uce.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setColor("Rojo");
		vehiculo.setMarca("Chevrolet");
		vehiculo.setTipo("P");
		this.vehiculoService.guardar(vehiculo);
		this.vehiculoService.consultar(1);
		vehiculo.setColor("Amarillo");
		this.vehiculoService.modificar(vehiculo);
		

		Matricula matricula = new Matricula();
		matricula.setPropietario("Willan Diaz");
		matricula.setNumero("PPP130");
		matricula.setVehiculo(vehiculo);
		vehiculo.setMatricula(matricula);

		this.matriculaService.guardar(matricula);
		this.matriculaService.consultar(1);
		matricula.setPropietario("Alexander Cordova");
		this.matriculaService.modificar(matricula);
		this.vehiculoService.borrar(7);
		this.matriculaService.borrar(8);
	}

}
