package com.javaex.ex03;

public class TheadApp {

	public static void main(String[] args) {
	
		/*아래랑 같은 기능
		DigitRunnableImpl digit = new DigitRunnableImpl();
		Thread thread = new Thread(digit);
		*/

		Thread thread = new Thread(new DigitRunnableImpl());
		
		thread.start();
		
	}

}
