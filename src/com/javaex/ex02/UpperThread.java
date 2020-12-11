package com.javaex.ex02;

public class UpperThread extends Thread {

	
	//필드
	//생성자
	//메소드 g/s
	//메소드 일반
	@Override
	public void run() {
		for(char big = 'A'; big<='Z'; big++) {
			System.out.print(big);
		}
	}	
	

}
