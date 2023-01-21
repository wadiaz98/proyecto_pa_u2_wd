package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu = new Estudiante();
		estu.setNombre("Willan");
		estu.setApellido("Diaz");
		estu.setCedula("172581538");
		estu.setCiudad("Quito");
		estu.setGenero("M");
		// this.estudianteService.agregar(estu);

		estu.setApellido("Cordova");
		this.estudianteService.modificar(estu);

		// this.estudianteService.borrar(3);

		// this.estudianteService.borrar(2);

		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setApellido("Diaz");
		ciudadano.setNombre("Diaz");

		Empleado empleado = new Empleado();
		empleado.setCiudadano(ciudadano);
		empleado.setSalario(new BigDecimal(200));
		empleado.setFechaIngreso(LocalDateTime.now());

		ciudadano.setEmpleado(empleado);
	}

}
