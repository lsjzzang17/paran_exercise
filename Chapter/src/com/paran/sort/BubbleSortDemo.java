package com.paran.sort;

public class BubbleSortDemo {

	public static void main(String[] args) {
		
		

		int[] bubbleArr = new int[]{66,10,1,99,5};
		for(int i = 0; i < bubbleArr.length; i++){
			System.out.print(bubbleArr[i]+"\t");
		}
		
		System.out.println();
		
		BubbleSortDemo.bubbleSort(bubbleArr);
		
		for(int i = 0; i < bubbleArr.length; i++){
			System.out.print(bubbleArr[i]+"\t");
		}
		

	}

	public static void bubbleSort(int[] array) {
		
		int temp;
		
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length-1; j++){
				
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
				
				
			}
		}
			
	}

}
