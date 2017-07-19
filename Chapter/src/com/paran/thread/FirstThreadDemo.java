package com.paran.thread;

public class FirstThreadDemo extends Thread{
	
	public void run(){
		for(int i = 0; i<10;i++){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t1 i = > "+i);
		}
	
	}
	
	public static void main(String[] args){
		
		Thread t = new Thread(new FirstThreadDemo());
		t.start();
		
			for(int i = 0; i<10;i++){
				try {
					sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("main i = > "+i);
			}
			System.out.println("main ends");
	}
	
		
		
		
}
	


