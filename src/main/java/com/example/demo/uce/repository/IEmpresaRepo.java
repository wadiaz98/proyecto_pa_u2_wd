package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Empresa;

public interface IEmpresaRepo {

	public void insertar(Empresa empresa);

	public void actualizar(Empresa empresa);

	public Empresa buscar(Integer id);

	public void borrar(Integer id);
}
