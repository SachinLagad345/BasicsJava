package com.bridgelabz.day7;

public class TIcTacToeGame {

	char board[] = new char[10];
	
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TIcTacToeGame game = new TIcTacToeGame();
		game.display();
	}

}
