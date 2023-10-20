package com.sunbeam;

public class Laber implements Employee1 {
	double rate;
	double hrs;
	public Laber(double rate, double hrs) {
		
		this.rate = rate;
		this.hrs = hrs;
	}
	@Override
	public double getsal() {
		// TODO Auto-generated method stub
		return hrs*rate;
	}
	

}
