package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IHotelService hotelSService;
	@Autowired
	private IHabitacionService habitacionService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Hotel hotel = this.hotelSService.consulta(1);

		for (Habitacion a : hotel.getHabitaciones()) {
			System.out.println(a);
		}

		Habitacion habitacion = new Habitacion();
		habitacion.setHotel(hotel);
		habitacion.setNumero("4");

		//this.habitacionService.guardar(habitacion);

		// this.habitacionService.borrar(11);

		
	
	}

}
