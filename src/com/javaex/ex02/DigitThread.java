package com.javaex.ex02;

public class DigitThread extends Thread {


	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int cnt=0; cnt<10; cnt++) {
			System.out.print(cnt);
		}
	}	
	
}
