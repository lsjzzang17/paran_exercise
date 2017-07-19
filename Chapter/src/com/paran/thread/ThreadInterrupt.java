package com.paran.thread;

public class ThreadInterrupt implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("오류남");
				break;
			}
			System.out.println(i);
		}
				
	}	
	
	public static void main(String[] args){
		System.out.println("main started");
		Thread t = new Thread(new ThreadInterrupt());
		t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();
		System.out.println("main ends");
	}
}
