package com.paran.chapter2;

import java.util.Scanner;

public class InstanceDemo {
	public static void main(String[] args){		
		
		String msg = "hello printer!";
		Printer ssPrinter = new Printer("삼성" , true);
		Printer hpPrinter = new Printer("HP" , false);
		Printer epsonPrinter = new Printer("Epson" , false);
		
		ssPrinter.print(msg);
		hpPrinter.print(msg);
		epsonPrinter.print(msg);
		epsonPrinter.print(7);
		
		
		Printer.PrintA(msg, false);
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 수를 입력해주세요");
		
		Double op1 = sc.nextDouble();
		Double op2 = sc.nextDouble();
		InstanceDemo.add(op1,op2);
		
		
		
		
	}
	
	public static Double add(Double op1,Double op2){
		
		System.out.println(op1+op2);
		return op1+op2;
		
	}
	
}

class Printer{
	
	String manufacture;
	boolean isColorPrinter;
	
	public Printer(String manufacture, boolean isColorPrinter){
		
		this.manufacture = manufacture;
		this.isColorPrinter = isColorPrinter;
		
	}
	
	public void print(String msg){
		
		if(isColorPrinter){
			
			System.out.println(manufacture + " color print " + msg);
			
		}else{
			
			System.out.println(manufacture + " mono print " + msg);
			
		}
			
	}
	
	public int print(int p){
		
		if(isColorPrinter){
			
			System.out.println("int " + manufacture + " color print " + p);
			
		}else{
			
			System.out.println("int" + manufacture + " mono print " + p);
			
		}
		return 0;
			
	}
	
	
	
	

	
	
	
	
	public static void PrintA(String msg , boolean isColor){
		System.out.println(msg + "\t" + isColor);
	}
	
	
	
	
}
