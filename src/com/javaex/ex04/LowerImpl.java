package com.javaex.ex04;

public class LowerImpl implements Runnable {

	@Override
	public void run() {

		for(char low = 'a'; low<='z'; low++) {
			System.out.print(low);
		}
	}

}
