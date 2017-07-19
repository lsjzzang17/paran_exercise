package com.paran.thread;

public class SecondThreadDemo extends Thread{
	
	String name;
	public SecondThreadDemo(String name){
		this.name = name;
	}
		
	public void run(){
		System.out.println(name + "start");
		for(int i = 0; i<10;i++){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "'s i = > "+i);
		}
	
	}
	
	public static void main(String[] args){
		
		SecondThreadDemo t1 = new SecondThreadDemo("Thread1");
		t1.setName("이건");
		t1.setDaemon(true);
		t1.start();
		System.out.println(t1.isAlive());
		try {
			t1.join(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.isAlive());
		System.out.println("main end");
//		SecondThreadDemo t2 = new SecondThreadDemo("Thread2");
//		t2.start();
//		
//		SecondThreadDemo t3 = new SecondThreadDemo("Thread3");
//		t3.start();
				
//		Thread t = new Thread(){  //어나					
//			public void run(){
//				System.out.println(this.getName());
//				t1.start();
//			}			
//		};
		
		
	
		//t1.start();
		
	}
		
}
	