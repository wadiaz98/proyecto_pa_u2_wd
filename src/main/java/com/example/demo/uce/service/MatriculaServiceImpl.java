package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Matricula;
import com.example.demo.uce.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo matriculaRepo;

	@Override
	public void guardar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.insertar(matricula);
	}

	@Override
	public void modificar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.actualizar(matricula);
	}

	@Override
	public Matricula consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.matriculaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.borrar(id);
	}

}
