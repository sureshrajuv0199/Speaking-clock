package com.suresh;

public class Main {

	public static void main(String[] args) {
		BasicSpeakingClock basicSpeakingClock = new BasicSpeakingClock();
		basicSpeakingClock.convert("11:55");
		basicSpeakingClock.convert("00:00");
		basicSpeakingClock.convert("12:00");
	}

}
