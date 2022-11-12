package com.bridgelabz.day7;

import java.util.Random;

public class GamblerStimulator {
	int stake = 100;

	public void putBet() {
		Random rnd = new Random();
		int reslt = rnd.nextInt(2);
		if (reslt == 0) {
			System.out.println("Lost bet of 1$!");
		} else {
			System.out.println("Won bet of 1$!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GamblerStimulator gm = new GamblerStimulator();
		gm.putBet();
	}

}
