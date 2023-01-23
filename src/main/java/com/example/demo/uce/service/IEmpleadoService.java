package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Empleado;

public interface IEmpleadoService {

	public void guardar(Empleado empleado);

	public void modificar(Empleado empleado);

	public Empleado buscar(Integer id);

	public void borrar(Integer id);
}
