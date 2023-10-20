package com.sunbeam;

public interface Employee1 {

	double getsal();
	default double CalculateInsentive() {

		return 0.0;

	}
	
	static double TotalIncome(Employee1[] arr) {
		
		double total=0.0;
		for(Employee1 e:arr)
			total  = e.getsal()+e.CalculateInsentive();
		
		return total;
		
		
	}
}