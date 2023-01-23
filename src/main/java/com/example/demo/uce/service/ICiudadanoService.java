package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Ciudadano;

public interface ICiudadanoService {

	public void guardar(Ciudadano ciudadano);

	public void mofidicar(Ciudadano ciudadano);

	public Ciudadano buscar(Integer id);

	public void eliminar(Integer id);

}
