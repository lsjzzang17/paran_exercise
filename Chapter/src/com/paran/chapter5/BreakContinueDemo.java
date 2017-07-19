package com.paran.chapter5;

public class BreakContinueDemo {

	public static void main(String[] args) {
		int count = 3;
		for(int i = 0; i <= count; i++){
			
			if(i %2 == 1 || i == 0 ){
				//break;
				continue;
			}else{
				System.out.println("2의배수 : " +i);	
			}
			
		}
		
		
		
		for(int i = 1; i < count; i++){
			System.out.println(i+"단");
			for(int j = 1; j < count; j++){
				
				if( i == 2 ) break;
				System.out.println("inner j"+j);
				
				//System.out.println(i+"*"+j+ "="+ i*j);
				
			}
			System.out.println("outer i"+i);
		}
				

	}

}
