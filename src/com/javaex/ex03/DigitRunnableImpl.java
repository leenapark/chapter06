package com.javaex.ex03;

public class DigitRunnableImpl implements Runnable {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int cnt=0; cnt<10; cnt++) {
			System.out.print(cnt);
		}
	}
	
	
}
