package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Empresa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpresaRepoImpl implements IEmpresaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empresa empresa) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empresa);
	}

	@Override
	public void actualizar(Empresa empresa) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empresa);
	}

	@Override
	public Empresa buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empresa.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
