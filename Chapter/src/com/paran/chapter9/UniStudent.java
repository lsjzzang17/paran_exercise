package com.paran.chapter9;

import com.paran.chapter7.Student;

public class UniStudent extends Student{
		
	public UniStudent(String name,String stuId,boolean isMilSer){
		//superclass의 생성자 함수 호출
		super(name,stuId,isMilSer);
				
	}
	

	public void showInfo(){
		super.showInfo();
		System.out.println("제대여부 : " + isMilSer);
	}

	
}
