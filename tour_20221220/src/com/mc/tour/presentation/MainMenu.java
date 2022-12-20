package com.mc.tour.presentation;

import java.util.Scanner;

import com.mc.tour.service.Airline;
import com.mc.tour.service.Tour;
import com.mc.tour.service.Tourist;

public class MainMenu {
	
	Scanner sc = new Scanner(System.in);
	
	//private Tour tour = new Tour();
	private Tour tour;
	private Airline[] airlines;
	private Tourist tourist;
	
	
	public MainMenu(Tour tour, Airline[] airlines, Tourist tourist) {
		this.tour = tour;
		this.airlines = airlines;
		this.tourist = tourist;
	}


	public void mainMenu() {
		
		while(true) {
		System.out.println("// 현재 보유 금액 : " + tour.bringBalance());
		System.out.println("// 현재 보유 마일리지 : " + tour.bringMileage());
		
		System.out.println("번호 \t 목적지 \t 가격\t 마일리지");
		for(int i = 0 ; i <airlines.length ; i++) {
			System.out.println(i + "\t" + airlines[i].getCountry()
								+ "\t" + airlines[i].getAirfare()
								+ "\t" + airlines[i].getMileage());
		}
		System.out.println("목적지 선택(번호입력) : ");
		int num = sc.nextInt();
		
		if(tour.isAble(num) == false) {
			System.out.println("현재 보유 금액이 부족합니다.");
			break;
		}else {
			tour.buyTicket(num);
			System.out.println("티켓팅 후 잔액은 : " + tour.bringBalance());
			System.out.println("티켓팅 후 마일리지는 : " + tour.bringMileage());
		}
		
		}
		
	}
	
}
