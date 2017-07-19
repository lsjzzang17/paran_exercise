package com.paran.sort;

public class SelectSortDemo {

	public static void main(String[] args) {
		
		int[] selectArr = new int[]{66,10,1,99,5};
		for(int i = 0; i < selectArr.length; i++){
			System.out.print(selectArr[i]+"\t");
		}
		
		System.out.println();
		
		SelectSortDemo.selectSort(selectArr);
		
		for(int i = 0; i < selectArr.length; i++){
			System.out.print(selectArr[i]+"\t");
		}
		
		
	}
	
	public static void selectSort(int[] array){  // 선택정렬
		
		int min;
		int temp;
		
		for(int i = 0; i < array.length-1;i++){
			min = i;
			for(int j = i; j<array.length; j++){
				
				if(array[min]>array[j]){
					min=j;
				}
				
			}
			temp = array[min];
			array[min] = array[i];
			array[i]=temp;
			
			
		}
		
		
	}
	

}
