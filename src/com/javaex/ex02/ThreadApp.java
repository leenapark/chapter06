package com.javaex.ex02;

public class ThreadApp {

	public static void main(String[] args) {
		// 스레드
		
		Thread diThread = new DigitThread();
		Thread loThread = new LowerThread();
		Thread upThread = new UpperThread();
		
		diThread.start();
		loThread.start();
		upThread.start();
				
		//주의
		//diThread.run(); 으로 바로 사용하지 않는다.
	}

}
