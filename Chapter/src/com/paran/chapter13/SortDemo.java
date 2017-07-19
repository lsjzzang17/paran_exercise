package com.paran.chapter13;

import java.util.Scanner;

public class SortDemo {

	public static void main(String[] args) {
		
			int num[] = {1,4,6,2,8,3,5,7,9,10};
			
			ArrayDemo.descendingOrder(num); //내림차순
			System.out.println();
			ArrayDemo.ascendingOrder(num);  //오름차순
						
			
	}
		
		
		
		public static void descendingOrder(int[] array){  // 내림차순
			
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
		
		
		
		public static void ascendingOrder(int[] array){  // 오름차순
			
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
