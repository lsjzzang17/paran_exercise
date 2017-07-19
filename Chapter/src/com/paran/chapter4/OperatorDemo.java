package com.paran.chapter4;



class StudentScore{
	
	String stuName; // 학생이름
	int engScore;   // 영어점수
	int korScore;   // 국어점수
	
	
	public StudentScore(String stuName, int korScore, int engScore){

		this.stuName=stuName;
		this.korScore=korScore;
		this.engScore = engScore;
		
	}
	
	public void showInfo(){
				
		System.out.println("=========정보출력 시작========");
		System.out.println("이름 : "+stuName);
		System.out.println("영어점수 : "+engScore);
		System.out.println("국어점수 : "+korScore);
		System.out.println("=========정보출력 종료========");
				
	}
	
	public double getAvg(){
				
		//System.out.println("평균 : " + (engScore + korScore)/2.0);
		return (engScore + korScore)/2.0;
	}
	
}


public class OperatorDemo {
			
		
	public static void main(String[] args){
		
		StudentScore obj1 = new StudentScore("홍길동",100,80); //학생1
		StudentScore obj2 = new StudentScore("임꺽정",50,40); //학생2
		StudentScore obj3 = new StudentScore("변사또",80,80); //학생3
		
		obj1.showInfo();  
		System.out.println();
		
		obj2.showInfo();
		System.out.println();
		
		obj3.showInfo();   //showInfo 메소드호출
		
		if(obj1.getAvg()>=90.0 && obj1.getAvg()<=100.0){
			
			System.out.println();
			obj1.showInfo();
			
		}
		
		if(obj2.getAvg()>=90.0 && obj2.getAvg()<=100.0){
			
			System.out.println();
			obj1.showInfo();
			
		}
		if(obj3.getAvg()>=90.0 && obj3.getAvg()<=100.0){
	
			System.out.println();
			obj1.showInfo();
	
		}
		
		int a = 1;
		int sum = a-- + 3;
		System.out.println(sum);
		System.out.println(a);
		
		a+=1+2;
		System.out.println(a);
		
	}
	
	//생성자함수
	public OperatorDemo(){
		
		
	}
	

}
