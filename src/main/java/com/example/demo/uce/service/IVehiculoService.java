package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Vehiculo;

public interface IVehiculoService {

	public void guardar(Vehiculo vehiculo);

	public void modificar(Vehiculo vehiculo);

	public Vehiculo consultar(Integer id);

	public void borrar(Integer id);
}
