package com.javaex.ex04;

public class UpperImpl implements Runnable {

	@Override
	public void run() {
		for(char up='A'; up<='Z'; up++) {
			System.out.print(up);
		}
	}

	
}
