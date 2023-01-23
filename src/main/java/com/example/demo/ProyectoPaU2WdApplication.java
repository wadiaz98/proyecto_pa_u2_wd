package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IEmpleadoService empleadoService;
	@Autowired
	private ICiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setApellido("Diaz");
		ciudadano.setNombre("Diaz");

		this.ciudadanoService.guardar(ciudadano);

		ciudadano.setNombre("Willan");
		this.ciudadanoService.mofidicar(ciudadano);
		this.ciudadanoService.buscar(1);

		Empleado empleado = new Empleado();
		empleado.setCiudadano(ciudadano);
		empleado.setSalario(new BigDecimal(200));
		empleado.setFechaIngreso(LocalDateTime.now());
		ciudadano.setEmpleado(empleado);

		this.empleadoService.guardar(empleado);

		empleado.setSalario(new BigDecimal(300));
		this.empleadoService.modificar(empleado);

		this.empleadoService.buscar(1);

		this.empleadoService.borrar(8);
		this.ciudadanoService.eliminar(17);

	}

}
