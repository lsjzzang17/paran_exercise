package com.paran.chapter5;

import java.util.Scanner;

public class ControlStatementDemo {
	
	public static void main(String[] args){
		
		Student[] stuArr = new Student[3];
		stuArr[0] = new Student("홍길동","201600001",true);
		stuArr[1] = new Student("임꺽정","201600002",false);
		stuArr[2] = new Student("변사또","201600003",true);
		
//		int j = 0;
//		while(j < stuArr.length){
//			stuArr[j].showInfo();			
//			j++;
//		}
			
		
		for(Student stu : stuArr){
			
			if(stu.getIsMilSer() ){
				stu.showInfo();
			}
			else{
				System.out.println(1);
			}
		}
		
		
//			if(1>2){
//			}else if(2>3){
//			}else{
//				
//			}
//					
		
//		for(int i = 0; i<stuArr.length;i++){
//						
//			if(stuArr[i].getIsMilSer()){
//				stuArr[i].showInfo();
//			}
//						
//		}
		
		
		
//		for(int i = 0; i<strArr.length;i++){
//			
//			stuArr[i] = new Student();
//			stuArr[i].Student(stuArr[i].name,stuArr[i].stuId,stuArr[i].isMilSer);
//			System.out.println(stuArr[i].name+"\t"+stuArr[i].stuId+"\t"+stuArr[i].isMilSer);
//		}
	
	
	}
}	

	


