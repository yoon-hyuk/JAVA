package com.mc.tour.service;

public class Tour {

	//(매개변수 있는 생성자를 통해 생성)
	private Airline al1 = new Airline("미국",3000,30000);
	private Airline al2 = new Airline("중국",2000,20000);
	private Airline al3 = new Airline("일본",1500,15000);
	private Tourist tourist = new Tourist(100000,1000);
	

	
	public boolean isAble(int num) {
		
		if(num == 1) return tourist.getBalance() >= al1.getAirfare();
		if(num == 2) return tourist.getBalance() >= al2.getAirfare();
		if(num == 3) return tourist.getBalance() >= al3.getAirfare();
		
		return false;
	}
	
	public void buyTicket1() {
		System.out.println(tourist.getBalance() - al1.getAirfare());
		System.out.println(tourist.getMileage() + al1.getMileage());
	}
	
	public void buyTicket2() {
		System.out.println(tourist.getBalance() - al2.getAirfare());
		System.out.println(tourist.getMileage() + al2.getMileage());
	}
	
	public void buyTicket3() {
		System.out.println(tourist.getBalance() - al3.getAirfare());
		System.out.println(tourist.getMileage() + al3.getMileage());
	}
	
	public int bringBalance() {
		return tourist.getBalance();
	}
	
	public int bringMileage() {
		return tourist.getMileage();
	}
}	

