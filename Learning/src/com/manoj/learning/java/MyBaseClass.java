package com.manoj.learning.java;


import com.manoj.learning.java.interfaces.InterfaceA;
import com.manoj.learning.java.interfaces.InterfaceB;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
		
//		ia.print();


		List abc = new ArrayList<Integer>();
		List b = new ArrayList<Integer>();

		abc.add(1);
		abc.add(2);
		abc.add(3);
		abc.add(4);

		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);

//		b.removeAll(abc);
		b.retainAll(abc);
		System.out.println(b);




		}



	}
	
