package com.opdemo;

public interface ISubject {
	public void removeObserver(IObserver observer);
	public void notifyObservers();
	public void registerObserver(IObserver observer);
}
