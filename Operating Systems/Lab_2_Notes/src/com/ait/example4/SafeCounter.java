package com.ait.example4;

public class SafeCounter {
	int value = 0;

	public SafeCounter(int value) {
		this.value = value;
	}

	void increment() {
		synchronized (this) {
			int temp = value;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			temp++;
			value = temp;
		}
	}

	int getValue() {
		synchronized (this) {
			return value;
		}
	}
}
