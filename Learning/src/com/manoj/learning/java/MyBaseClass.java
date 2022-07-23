package com.manoj.learning.java;


import com.manoj.learning.java.interfaces.InterfaceA;
import com.manoj.learning.java.interfaces.InterfaceB;

public class MyBaseClass {

//	@Override
//	public void print() {
//		System.out.println("Printing using Interface A print Method");
//		
//	}
//	
//	@Override
//	public void defaultPrint() {
//		// TODO Auto-generated method stub
//		InterfaceB.super.defaultPrint();
//	}
//
//	
	
	public static void main(String[] args) {

		MyBaseClass obj = new MyBaseClass();
//		obj.print();
//		
//		obj.defaultPrint();
		InterfaceA.staticPrint();
		InterfaceB.staticPrint();
		
		InterfaceA ia = ()->System.out.println("Printing through LAMBDA Expresssions...");
		
		ia.print();
		
		}
	}
	
