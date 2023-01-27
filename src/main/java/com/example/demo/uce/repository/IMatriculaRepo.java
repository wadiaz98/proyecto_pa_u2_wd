package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Matricula;

public interface IMatriculaRepo {

	public void insertar(Matricula matricula);

	public void actualizar(Matricula matricula);

	public Matricula buscar(Integer id);

	public void borrar(Integer id);

}
