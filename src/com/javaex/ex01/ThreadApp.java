package com.javaex.ex01;

public class ThreadApp {

	public static void main(String[] args) throws Exception {
		// Thread
		// 스레드 방식

		Thread thread = new DigitThread();

		// 스레드 실행
		thread.start();

		/*스레드에 사용될 코드
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);
		}
		*/
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			Thread.sleep(1000);
		}

	}

}
