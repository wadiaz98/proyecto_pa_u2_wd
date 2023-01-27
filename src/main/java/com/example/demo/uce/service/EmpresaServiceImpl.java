package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Empresa;
import com.example.demo.uce.repository.IEmpresaRepo;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

	@Autowired
	private IEmpresaRepo empresaRepo;

	@Override
	public void guardar(Empresa empresa) {
		// TODO Auto-generated method stub
		this.empresaRepo.insertar(empresa);
	}

	@Override
	public void modificar(Empresa empresa) {
		// TODO Auto-generated method stub
		this.empresaRepo.actualizar(empresa);
	}

	@Override
	public Empresa consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.empresaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.empresaRepo.borrar(id);
	}

}
