package com.bridgelabz.day7;

import java.util.Random;

public class GamblerStimulator {
	int stake = 100;

	public void putBet() {
		Random rnd = new Random();
		int reslt = rnd.nextInt(2);
		if (reslt == 0) {
			System.out.println("Lost bet of 1$!");
			stake--;
			System.out.println("Remaining money is " + stake + "$");
		} else {
			System.out.println("Won bet of 1$!");
			stake++;
			System.out.println("Remaining money is " + stake + "$");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GamblerStimulator gm = new GamblerStimulator();
		int dayCount = 1;

		while(dayCount <= 20)
		{
			int high = gm.stake + (int)Math.floor(0.5 * gm.stake);
			int low = gm.stake - (int)Math.floor(0.5 * gm.stake);
			while( !(gm.stake == high || gm.stake == low) )
			{
				gm.putBet();
			}
			System.out.println("Todays bet game for day "+ dayCount + " ended! Money is " + gm.stake+"$\n");
			dayCount++;
		}
		
		if(gm.stake > 100)
			System.out.println("Stake won in 20 days is " + (gm.stake-100) + "$");
		else
			System.out.println("Stake lost in 20 days is " + (100-gm.stake) + "$");
	}

}
