package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.repository.IEmpleadoRepo;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepo empleadoRepo;

	@Override
	public void guardar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepo.agregar(empleado);
	}

	@Override
	public void modificar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleadoRepo.actualizar(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepo.borrar(id);
	}

}
