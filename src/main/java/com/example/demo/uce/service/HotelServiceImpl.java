package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.IHotelRepo;

@Service
public class HotelServiceImpl implements IHotelSService {

	@Autowired
	private IHotelRepo hotelRepo;

	@Override
	public void guardar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.insertar(hotel);
	}

	@Override
	public void modificar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepo.actualizar(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepo.borrar(id);
	}

}
