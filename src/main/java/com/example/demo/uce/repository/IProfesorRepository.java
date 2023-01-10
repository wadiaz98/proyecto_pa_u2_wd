package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Profesor;

public interface IProfesorRepository {

	public void crear(Profesor profesor);

	public void actualizar(Profesor profesor);

	public Profesor buscar(Integer id);

	public void borrar(Integer id);

}
