package com.ait.example2;
public class UnsafeCounter {
	int value = 0;
	
	public UnsafeCounter(int value) {
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
