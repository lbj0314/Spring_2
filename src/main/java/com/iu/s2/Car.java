package com.iu.s2;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private Engine engine;
	private Wheel wheel;
	private ArrayList<String> name;
	private HashMap<String, Integer> price;
	
	@PostConstruct //초기화 메서드
	public void init() {
		
	}
	
	@PreDestroy // 종료되기 전 메서드
	public void destroy() {
		
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(Engine engine, Wheel wheel, ArrayList<String> name, HashMap<String, Integer> price) {
		this.engine = engine;
		this.wheel = wheel;
		this.name = name;
		this.price = price;
	}
	
	
	
	public HashMap<String, Integer> getPrice() {
		return price;
	}

	public void setPrice(HashMap<String, Integer> price) {
		this.price = price;
	}

	public ArrayList<String> getName() {
		return name;
	}

	public void setName(ArrayList<String> name) {
		this.name = name;
	}

	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public void info() {
		System.out.println("Engine fuel : " + this.engine.getFuel());
		System.out.println("Wheel brand : " + this.wheel.getBrand());
	}
	
	
	
	
}
