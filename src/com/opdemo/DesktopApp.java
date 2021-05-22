package com.opdemo;

public class DesktopApp implements IObserver,IDisplay {
	private ISubject weatherData;
	private int temperature;
	private int humidity;
	@Override
	public void update(int temp, int humidity) {
		this.temperature = temp;
		this.humidity = humidity;
		display();	
	}
	
	public DesktopApp(ISubject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Measurement Changed in Desktop App: temperature:"+this.temperature+" humidity:"+this.humidity);
		
	}

}
