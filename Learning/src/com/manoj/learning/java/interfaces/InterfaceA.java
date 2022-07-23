package com.manoj.learning.java.interfaces;

@FunctionalInterface
public interface InterfaceA {
	void print();
	
	default void defaultPrint() {
		System.out.println("Printing from default Print fn of Interface A");
	}
	
	static void staticPrint() {
			System.out.println("Printing from default Print fn of Interface A");
		}

}
