package com.paran.misson;

import java.text.DecimalFormat;

public class AlltypeGeneric {
	
	public static <T> void main(String[] args){
		
		Add add = new Add(3,4);
		Add add2 = new Add(3.0,4.4);
		Add add3 = new Add(3.1,4.7);
	}
	
}

class Add<T>{
	
	DecimalFormat Doubleformat = new DecimalFormat("#.##");
	
	public int intType1;
	public int intType2;
	
	public float floatType1;
	public float floatType2;
	
	public Double doubleType1;
	public Double doubleType2;
		
	public <T> Add(T type,T type2){
		
		if(type instanceof Integer){
			if(type2 instanceof Integer){
				
				intType1 = (int) type;
				intType2 = (int) type2;
				showInfo(intType1,intType2);
			}
		}
		
		if(type instanceof Float){
			if(type2 instanceof Float){
				
				floatType1 = (Float) type;
				floatType2 = (Float) type2;
				showInfo(intType1,intType2);
			}
		}
		
		if(type instanceof Double){
			if(type2 instanceof Double){
				
				doubleType1 = (Double) type;
				doubleType2 = (Double) type2;
				showInfo(doubleType1,doubleType2);
			}
		}
				
	}
	
	
	public void showInfo(int num1, int num2){
		System.out.println(num1+num2);
	}
	
	public void showInfo(float num1, float num2){
		System.out.println(num1+num2);
	}
	
	public void showInfo(Double num1 , Double num2){
		System.out.println(Doubleformat.format((num1+num2)));
	}
	
}




