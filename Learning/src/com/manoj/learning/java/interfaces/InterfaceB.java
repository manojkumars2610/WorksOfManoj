package com.manoj.learning.java.interfaces;

public interface InterfaceB {
void print();
	
	default void defaultPrint() {
		System.out.println("Printing from default Print fn of Interface B");
	}

	static void staticPrint() {
		System.out.println("Printing from default Print fn of Interface B");
	}

}
