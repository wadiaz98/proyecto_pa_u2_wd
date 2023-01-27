package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Matricula;

public interface IMatriculaService {

	public void guardar(Matricula matricula);

	public void modificar(Matricula matricula);

	public Matricula consultar(Integer id);

	public void borrar(Integer id);

}
