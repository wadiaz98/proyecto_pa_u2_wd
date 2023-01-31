package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.repository.IAutorRepo;

@Service
public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepo autorRepo;
	@Override
	public void guardar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.insertar(autor);
	}

}
