package com.bridgelabz.day7;

import java.util.Scanner;

public class TIcTacToeGame {

	char board[] = new char[10];
	char mychar = 'x';
	char compchar = 'o';
	
	public void display()
	{
		for(int i=1;i<board.length;i++)
		{
			
			if(board[i] == '\u0000')
			{
				if(i%3 == 0)
					System.out.print(" -- "+" ");
				else
					System.out.print(" -- "+" |");
			}
			else
			{
				if(i%3==0)
					System.out.print(" " +board[i] + "   ");
				else
					System.out.print(" " +board[i] + "   |");
			}
			
			if(i%3 == 0) {
				System.out.println("\n_____|_____|_____");
				System.out.println("     |     |     ");
			}
		}
	}
	
	
	public void chooseLetter()
	{
		System.out.println("Please choose your Letter!\n Press 1 for X\n Press 2 for O");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i==1) {
			mychar = 'X';
			compchar = 'O';
		}
		else
		{
			mychar = 'O';
			compchar = 'X';
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TIcTacToeGame game = new TIcTacToeGame();
		game.chooseLetter();
		game.display();
	}

}
