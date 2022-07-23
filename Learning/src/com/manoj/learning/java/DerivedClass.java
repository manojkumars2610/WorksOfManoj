package com.manoj.learning.java;

public class DerivedClass extends BaseClass {
	
	protected void print() {
//		super.print();
		System.out.println("Printing from Derived class");
	}

	public static void main(String[] args) {

		BaseClass obj = new DerivedClass();
		
		obj.print();
	}

}
