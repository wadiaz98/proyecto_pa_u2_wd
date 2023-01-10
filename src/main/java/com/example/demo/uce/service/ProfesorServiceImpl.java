package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.repository.IProfesorRepository;

@Service
public class ProfesorServiceImpl implements IProfesorService {

	@Autowired
	private IProfesorRepository profesorRepository;

	@Override
	public void agregar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.profesorRepository.crear(profesor);
	}

	@Override
	public void modificar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.profesorRepository.actualizar(profesor);
	}

	@Override
	public Profesor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.profesorRepository.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.profesorRepository.borrar(id);
	}

}
