package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelService {

	public void guardar(Hotel hotel);

	public void modificar(Hotel hotel);

	public Hotel consulta(Integer id);

	public Hotel consultaLigero(Integer id);

	public void eliminar(Integer id);
}
