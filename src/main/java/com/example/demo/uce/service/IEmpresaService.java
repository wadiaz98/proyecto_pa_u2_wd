package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Empresa;

public interface IEmpresaService {

	public void guardar(Empresa empresa);

	public void modificar(Empresa empresa);

	public Empresa consultar(Integer id);

	public void borrar(Integer id);

}
