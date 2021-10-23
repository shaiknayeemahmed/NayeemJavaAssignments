package com.shristi.interfaces;

public class Basic implements BasicCalculator{

	@Override
	public void add(int x, int y) {
		System.out.println("Sum is "+ x+y);
		
	}

	@Override
	public void difference(int x, int y) {
		if(x > y) {
			System.out.println("diff is "+ (x-y));
		}else {
			System.out.println("diff is "+(y-x));
		}
		
	}

	@Override
	public void product(int x, int y) {
		System.out.println("Product is "+(x*y));
		
	}

	@Override
	public void divide(int x, int y) {
		System.out.println("Divided value" + x/y);
		
	}
	
}
