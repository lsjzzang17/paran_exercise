package com.paran.inner;

abstract class AnonymousInner {
	public abstract void myMethod();

}

public class Outer_class{
	
	public static void main(String[] args){
		int num=1;
		AnonymousInner inner = new AnonymousInner() {
			public void myMethod(){
				System.out.println("This is an example of Anonymous");
				
			}
		};
		inner.myMethod();
		
		AnonymousInner inner2 = new AnonymousInner() {
			@Override
			public void myMethod() {
				System.out.println("test");				
			}
		};
		inner2.myMethod();		
	}
		
	
}