package com.shristi.polymorphism;

public class OverloadMain {

	public static void main(String[] args) {
		Employee manager = new Employee("nayeem", "Manager");
		System.out.println(manager.calcBonus(1000, 1000));
		
		Employee programmer = new Employee("ahmed", "Programmer");
		System.out.println(programmer.calcBonus(1000));
		
		Employee director = new Employee("shaik", "Director");
		System.out.println(director.calcBonus(1000, 1000, 1000));
		
		
		

	}

}
