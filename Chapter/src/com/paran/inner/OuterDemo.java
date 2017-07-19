package com.paran.inner;

class OuterDemo {
	private int num;
	private InnerDemo innerObj;
	
	public class InnerDemo{
		
		public int getNum(){
			System.out.println("이너");
			return num;
		}
		
	}
	
	public OuterDemo(int num){
		this.num = num;
		innerObj = new InnerDemo();
	}
	
	public InnerDemo getInnerObj(){
		return innerObj;
	}
	
}

class My_class2{
	
	public static void main(String[] args){
				
		OuterDemo outer = new OuterDemo(100);  //아우터 생성
		OuterDemo.InnerDemo inner = outer.new InnerDemo(); //아우터 로 이너클래스 접근 ->이너생성
		System.out.println(inner.getNum());  //이너클래스 변수로 메소드 접근
		
		OuterDemo outer1 = new OuterDemo(200); //아우터 생성자 200값으로 호출
		System.out.println(outer1.getInnerObj().getNum()); // 아우터 변수로 InnerObj메소드를 통해 이너클래스의 getNum메소드 호출
		
	}
}