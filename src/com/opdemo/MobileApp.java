package com.opdemo;

public class MobileApp implements IObserver,IDisplay {
	private ISubject weatherData;
	private int temperature;
	private int humidity;
	
	public MobileApp(ISubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(int temp, int humidity) {
		this.temperature =temp;
		this.humidity=humidity;
		display();
		
	}

	@Override
	public void display() {
		System.out.println("Measurement Changed in Mobile App: temperature:"+this.temperature+" humidity:"+this.humidity);
		
	}

}
