package com.sunbeam;

public class Manager implements Employee1 {
	double da,bs;

	public Manager(double da, double bs) {
		
		this.da = da;
		this.bs = bs;
	}

	@Override
	public double getsal() {
		// TODO Auto-generated method stub
		return da+bs;
		
	}
	

}
