package com.ait.example3;
public class UnSafeCounter {
	int value = 0;
	
	public UnSafeCounter(int value) {
		this.value = value;
	}

	void increment() {
		int temp = value;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		temp++;
		value = temp;
	}
	
	int getValue() {
		return value ;
	}
}
