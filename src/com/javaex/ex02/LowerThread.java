package com.javaex.ex02;

public class LowerThread extends Thread {


	//소문자
	
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	@Override
	public void run() {
		for(char small = 'a'; small<='z'; small++) {
			System.out.print(small);
		}
	}
}
