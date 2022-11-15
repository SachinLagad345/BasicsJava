package com.bridgelabz.day7;

import java.util.Random;
import java.util.Scanner;

public class TIcTacToeGame {

	char board[] = new char[10];
	char mychar = 'x';
	char compchar = 'o';
	
	public void showBoard()
	{
		System.out.println("*******GAME BOARD******");
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
	
	
	public void chooseLetter(Scanner sc)
	{
		System.out.println("Please choose your Letter!\n Press 1 for X\n Press 2 for O");
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
	
	public void makeMove(Scanner sc)
	{
		boolean check = false;
		int n = 0;
		while(!check)
		{
			System.out.println("Users Turn");
			System.out.println("Mark/Write position from 1 to 9");
			n = sc.nextInt();
			check = isEmpty(n);
		}
		board[n] = mychar;
		showBoard();
		makeCompMove();
	}
	
	public void makeCompMove()
	{
		System.out.println("Computers turn!");
		Random rnd = new Random();
		boolean check = false;
		int c = 0;
		while(!check)
		{
			c = rnd.nextInt(9)+1;
			check = isEmpty(c);
		}
		board[c] = compchar;
		showBoard();
	}
	
	public boolean isEmpty(int n)
	{
		if(board[n] == 'X' || board[n] == 'O') {
			System.out.println("Position already filled!Choose other one");
			return false;
		}
		else
			return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TIcTacToeGame game = new TIcTacToeGame();
		Scanner sc = new Scanner(System.in);
		game.chooseLetter(sc);
		game.showBoard();
		game.makeMove(sc);
		sc.close();
	}

}
