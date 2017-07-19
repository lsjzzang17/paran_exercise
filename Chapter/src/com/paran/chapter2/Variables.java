package com.paran.chapter2;

//1 정수
//2 실수
//3 ?

public class Variables {
	static int varType;
	final static int MAX_NO = 5; // 상수는 대문자로 쓰는게 보편적
	static int MAX_NO1 = 10; 
	
	
	public static void main(String[] args){
		
	//	MAX_NO = 3;
		MAX_NO1 = 3;
		System.out.println(MAX_NO);
		System.out.println(MAX_NO1);
		
		Variables va = new Variables();
		va.showInFo();
		int num;
		
	}
	
	
	public final void showInFo(){
			
		System.out.println(varType);
	
		
	}
	
}


class Animal{
	
	public void breath(){
		
		System.out.println("동물 숨쉬기");
		
	}
}


class Person extends Animal{
	
	public void breath(){
		
		System.out.println("사람 숨쉬기");
		
	}
	
	public static void main(String[] args){
		
		Person obj = new Person();
		obj.breath();
		
	}
	
}
	
	

	
	
	
	
	


