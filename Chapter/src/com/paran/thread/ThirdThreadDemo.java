package com.paran.thread;

public class ThirdThreadDemo implements Runnable{
	
	String name;
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThirdThreadDemo("Runnable Thread1"));
		Thread t2 = new Thread(new ThirdThreadDemo("Runnable Thread2"));
		t1.start();		
		t2.start();
	}
	
	
	public ThirdThreadDemo(String name){
		this.name = name;
	}
		

	@Override
	public void run() {
		for(int i = 0; i<10;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + "'s i = > "+i);
		}
		
	}

}
