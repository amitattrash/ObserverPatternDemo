package com.opdemo;

public class TestOPDemo {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		DesktopApp deskObj = new DesktopApp(weatherData);
		MobileApp mobileObj = new MobileApp(weatherData);	
		weatherData.setMeasurement(10, 20);
		weatherData.setMeasurement(20, 30);
		weatherData.setMeasurement(40, 50);		
	}
}
