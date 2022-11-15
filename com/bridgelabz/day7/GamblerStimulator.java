package com.bridgelabz.day7;

import java.util.Random;

public class GamblerStimulator {
	
	public int dayBet()
	{
		int stake = 100;
		int dayCount = 1;
		Random rnd = new Random();

			int high = stake + (int)Math.floor(0.5 * stake);
			int low = stake - (int)Math.floor(0.5 * stake);
			while( !(stake == high || stake == low) )
			{
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
			System.out.println("Todays bet game for day "+ dayCount + " ended! Money is " + stake+"$\n");

		return stake;
	}
	
	public int monthlyBet()
	{
		int profit = 0;
		int loss = 0;
		String dcsn[] = new String[30];
		int reslts[] = new int[30];
		int max = 0;
		int min = 0;
		int luckyday = 0;
		int unluckyday = 0;
		int stake =0;
		for(int i=0;i<30;i++)
		{
			stake = dayBet();
			if(stake > 100)
			{
				dcsn[i] = "Won";
				reslts[i] = stake - 100;
				if(max < (stake - 100))
				{
					max = stake - 100;
					luckyday = i+1;
				}
				profit += (stake-100);
			}
			else
			{
				dcsn[i] = "Lost";
				reslts[i] = 100 - stake;
				if(min < (100 - stake))
				{
					min = 100 - stake;
					unluckyday = i+1;
				}
				loss += (100-stake);
			}
		}		
	
	System.out.println("\n Monthly Report \n ");
	for(int i=0;i<dcsn.length;i++)
	{
		System.out.println("Amount " + dcsn[i] + " for day " + (i+1) + " is "+ reslts[i] + "$");
	}
	
	System.out.println("Luckiest day is "+ luckyday+ " and amount won that day is "+ max);
	System.out.println("Unluckiest day is "+ unluckyday+ " and amount lost that day is "+ min);
	System.out.println("Profit is "+ profit+" and loss is " + loss );
	if(profit > loss)
		return 1;
	else
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GamblerStimulator gm = new GamblerStimulator();
		
		int money = gm.monthlyBet();
		if(money == 0)
			System.out.println("\n\n Quitting Gambling!");
		else
			System.out.println("\n\n Gamble for next month");
	}
}
