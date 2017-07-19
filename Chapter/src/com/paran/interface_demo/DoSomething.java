package com.paran.interface_demo;

interface DoIt {
	
	void doSomething(int i,double x);
	
	int doSomethingElse(String s);
	
	default boolean didItWork(int i, double x , String s){
		System.out.println("DoIt");
		return true;
		
	}
}

interface DoItPlus extends DoIt{

	default boolean didItWork(int i ,double x , String s){
		DoIt.super.didItWork(i, x, s);
		System.out.println("DoItPlus");
		return true;
		
	}
}


public class DoSomething implements DoItPlus{

	@Override
	public void doSomething(int i, double x) {
		// TODO Auto-generated method stub
		System.out.println("doSomething class");
		didItWork(1,2.0,"d");
	}

	@Override
	public int doSomethingElse(String s) {
		// TODO Auto-generated method stub
		
		return 0;
	}
	
}

class InterfaceDemo2{
	
	public static void main(String[] args){
		//DoSomething ds = new DoSomething();
		//ds.didItWork(1, 2.0, "dl");
		//ds.doSomething(1, 2.0);
		DoItPlus doPlus = new DoSomething();
		doPlus.doSomething(1, 2.0);
	}
}


