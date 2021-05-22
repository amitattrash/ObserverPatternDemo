package com.opdemo;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {
	private int temperature;
	private int humidity;
	List<IObserver> observerList ;
	
	public void setMeasurement(int temp, int humidity) {
		this.temperature=temp;
		this.humidity = humidity;
		measurementChanged();
	}
	
	private void measurementChanged() {
		notifyObservers();
		
	}
	public WeatherData() {
		observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(IObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(IObserver observer: observerList) {
			observer.update(this.temperature,this.humidity);
		}
	}

}
