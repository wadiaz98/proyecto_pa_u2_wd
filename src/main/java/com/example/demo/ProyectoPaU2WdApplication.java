package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IProfesorService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IProfesorService profesorService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Profesor profe = new Profesor();
		profe.setNombre("Willan");
		profe.setApellido("Diaz");
		profe.setCedula("172581538");
		profe.setAsignatura("Programacion avanzada");
		profe.setGenero("M");
		// this.estudianteService.agregar(estu);

		profe.setApellido("Cordova");
		this.profesorService.modificar(profe);

		// this.estudianteService.borrar(3);

		// this.estudianteService.borrar(2);
	}

}
