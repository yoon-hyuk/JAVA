package com.mc.tour;

import com.mc.tour.presentation.MainMenu;
import com.mc.tour.service.Airline;
import com.mc.tour.service.Tour;
import com.mc.tour.service.Tourist;

public class Run {

	public static void main(String[] args) {
			
		Airline[] airlines = {new Airline("미국행", 3000, 30000),new Airline("중국행", 2000, 20000), new Airline("일본행", 1500, 15000)};
		Tourist tourist = new Tourist(10000,1000);
		Tour tour = new Tour(airlines, tourist);
		
		new MainMenu(tour, airlines, tourist).mainMenu();
	}
}
