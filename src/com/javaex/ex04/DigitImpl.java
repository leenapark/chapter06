package com.javaex.ex04;

public class DigitImpl implements Runnable {

	@Override
	public void run() {
		for(int cnt=0; cnt<10; cnt++) {
			System.out.print(cnt);
		}
	}

}
