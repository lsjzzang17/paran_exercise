package com.paran.chapter13;

import java.util.Scanner;

public class ArrayDemo {
	
	
	public static void main(String[] args) {
		
		ArrayDemo arr = new ArrayDemo();
		//int[] num = new int[10];
		
		int num[] = {1,4,6,2,8,3,5,7,9,10};
				
//		for(int i = 0;i < num.length;i++){
//			num[i]=i+1;
//			//System.out.print(num[i]+"\t");
//			
//		}
		//System.out.println();
		//arr.reverseArrayValue(num);
		
		System.out.println("내림차순 : 1\n오름차순 : 2");
		
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		
		switch(choise){
		
		case 1: {
		ArrayDemo.descendingOrder(num); //내림차순
		break;
		}
		case 2: {
		ArrayDemo.ascendingOrder(num);  //오름차순
		break;
		}
		default : {
			System.out.println("잘못입력했어요");
			
		}
		
		
	}
}
	
	
	public void reverseArrayValue(int[] array){
		
		int temp=10;
		
		
		for(int i = 0; i < array.length; i++){      
					
							
				array[i]=temp;
				temp--;
				System.out.print(array[i]+"\t");
		 }
			
		 
			
	}
		
	
	
	public static void descendingOrder(int[] array){
		
		int temp;	
		
		for(int i = 0; i < array.length; i++){      
			
		  for(int j = i+1; j < array.length; j++){
							
				
				if(array[i]<array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}	
				
		 }
			
		 System.out.print(array[i]+"\t");
			
		}
		
	}
	
	
	
	public static void ascendingOrder(int[] array){
		
		int temp;	
		
		for(int i = 0; i < array.length; i++){      
			
		  for(int j = i+1; j < array.length; j++){
							
				
				if(array[i]>array[j]){
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
					
				}	
				
		 }
			
		 System.out.print(array[i]+"\t");
			
		}
				
	}	
	
}
		
		

			
		

	


