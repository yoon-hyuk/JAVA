package com.mc.tour.service;

public class Tour {

	//  배열로 변경
	private Airline[] airlines;
	//	private Airline al1 = new Airline("미국",3000,30000);
	//	private Airline al2 = new Airline("중국",2000,20000);
	//	private Airline al3 = new Airline("일본",1500,15000);
	
	private Tourist tourist;
	//private Tourist tourist = new Tourist(100000,1000);
	
		public Tour(Airline[] airline, Tourist tourist) {
		super();
		this.airlines = airlines;
		this.tourist = tourist;
	}

	
	public boolean isAble(int num) {
		return tourist.getBalance() >= airlines[num].getAirfare();
		
	}
	//배열을 이용하여 변경
	public void buyTicket(int num) {
		tourist.setBalance(tourist.getBalance() - airlines[num].getAirfare());
		tourist.setMileage(tourist.getMileage() + airlines[num].getMileage());
	}
	

//	public void buyTicket1() {
//		System.out.println(tourist.getBalance() - al1.getAirfare());
//		System.out.println(tourist.getMileage() + al1.getMileage());
//	}
	
	
	
	public int bringBalance() {
		return tourist.getBalance();
	}
	
	public int bringMileage() {
		return tourist.getMileage();
	}
}	

