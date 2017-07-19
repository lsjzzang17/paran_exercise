package com.paran.chapter5;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args){
		
		int month = 6;
		String monthString="";
		String quarter = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달을 입력해주세요");
		month = sc.nextInt();
		
		//if문으로 흐름
		if( month >= 1 && month <= 3){
			quarter = "1/4";
		}else if( month >= 4 && month <= 6){
			quarter = "2/4";
		}else if( month >= 7 && month <= 9){
			quarter = "3/4";
		}else{
			quarter = "4/4";
		}
		
		System.out.println(quarter);
		
		//브레이크 없이 흐름
		switch(month){
			case 1 :
			case 2 :
			case 3 : quarter = "1/4";
					 break;
			case 4 :
			case 5 :
			case 6 : quarter = "2/4";
					 break;
			case 7 :
			case 8 :
			case 9 : quarter = "3/4";
					 break;
			default : quarter = "invalid month";
		}
		
		System.out.println(quarter);
		
		//스위치(달을 입력받기)
		switch(month){
		
		case 1 : monthString = "January";
		break;
		
		case 2 : monthString = "Febuary";
		break;
		
		case 3 : monthString = "March";
		break;
		
		case 4 : monthString = "April";
		break;
		
		case 5 : monthString = "May";
		break;
		
		case 6 : monthString = "June";
		break;
		
		case 7 : monthString = "July";
		break;
		
		case 8 : monthString = "August";
		break;
		
		case 9 : monthString = "September";
		break;
		
		case 10 : monthString = "October";
		break;
		
		case 11 : monthString = "November";
		break;
		
		case 12 : monthString = "December";
		break;
		
		default : monthString = "invalid month";
				
		
		}
		System.out.print(monthString);
		
		
		
	}

}
