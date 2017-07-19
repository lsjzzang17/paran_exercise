package com.paran.interface_demo;


interface Animal{
	
	abstract public void eat();
	abstract public void travel();

}

interface Walkable{
	abstract public void walk();
}

class Mammal implements Animal , Walkable{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal eat method");
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal travel method");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}

class Amphibian implements Animal , Walkable{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Amphibian eat method");
		
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Amphibian travel method");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo{
	public static void main(String[] args){
	
		Animal obj1 = new Mammal();
		Amphibian obj2 = new Amphibian();
		Walkable obj3 = (Walkable)obj1;
		
		obj1.eat();
		obj1.travel();
			
		
	}

}
