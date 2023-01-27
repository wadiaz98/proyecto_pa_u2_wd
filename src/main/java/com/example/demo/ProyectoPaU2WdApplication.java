package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Empresa;
import com.example.demo.uce.service.IEmpresaService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IEmpresaService empresaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Empresa empresa = new Empresa();
		empresa.setNombre("Caballito");
		empresa.setUbicacion("Paldea");

		List<Empleado> empleados = new ArrayList<>();

		Empleado empleado1 = new Empleado();
		empleado1.setEmpresa(empresa);
		empleado1.setFechaIngreso(LocalDateTime.of(2023, 01, 27, 0, 0));
		empleado1.setSalario(new BigDecimal(200));
		empleados.add(empleado1);

		Empleado empleado2 = new Empleado();
		empleado2.setEmpresa(empresa);
		empleado2.setFechaIngreso(LocalDateTime.of(2023, 01, 27, 0, 0));
		empleado2.setSalario(new BigDecimal(200));
		empleados.add(empleado2);

		Empleado empleado3 = new Empleado();
		empleado3.setEmpresa(empresa);
		empleado3.setFechaIngreso(LocalDateTime.of(2023, 01, 27, 0, 0));
		empleado3.setSalario(new BigDecimal(200));
		empleados.add(empleado3);

		empresa.setEmpleado(empleados);

		this.empresaService.guardar(empresa);
		this.empresaService.consultar(2);

		empresa.setUbicacion("Kanto");
		this.empresaService.modificar(empresa);
		this.empresaService.borrar(1);
	}

}
