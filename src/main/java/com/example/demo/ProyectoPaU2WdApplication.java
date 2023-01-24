package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.IHotelSService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IHotelSService hotelSService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Hotel hotel = new Hotel();
		hotel.setDireccion("Miraflores");
		hotel.setNombre("Lujin");

		List<Habitacion> habitaciones = new ArrayList<>();
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setHotel(hotel);
		habitacion1.setNumero("1");
		habitaciones.add(habitacion1);
		Habitacion habitacion2 = new Habitacion();
		habitacion1.setHotel(hotel);
		habitacion1.setNumero("2");
		habitaciones.add(habitacion2);
		Habitacion habitacion3 = new Habitacion();
		habitacion1.setHotel(hotel);
		habitacion1.setNumero("2");
		habitaciones.add(habitacion3);

		hotel.setHabitaciones(habitaciones);
		this.hotelSService.guardar(hotel);

		hotel.setNombre("Lujito");
		this.hotelSService.modificar(hotel);
		this.hotelSService.buscar(3);
		this.hotelSService.eliminar(4);

	}

}
