package com.snakeladder.game;

public class SnakeLadderGame {

	// Constant
		public static final  int NO_PLAY=1;
		public static final int LADDER_PLAY=2;
		public static final	int SNAK_PLAY=3;
		public static final int Ladder_board=100;
		
	public static void main(String[] args) {
		System.out.println("Welcome to the Snake Ladder Game");


		int diesrolled;
		int newposition=0;
		int player1_position=0; 

		while (player1_position < Ladder_board )
		{
			diesrolled = (int) (Math.random()*6) + 1;
			System.out.println("DIES ROLLED" + diesrolled );
			int instruction = (int) (Math.random()*3+1);
			System.out.println("instruction" + instruction );

			switch ((int)instruction )  {
			case  NO_PLAY :
				newposition=diesrolled -(1 * diesrolled) ;
				break;
			case LADDER_PLAY :
				newposition= (1 * diesrolled);
				break;
			case SNAK_PLAY :
				newposition= -(1 * diesrolled) ;
			}
			player1_position = player1_position + newposition ;
			System.out.println("The value of instruction is  " + player1_position );
			if (player1_position < 0) {
				player1_position=0;

			}
			System.out.println("Player 1 Now @ " + player1_position + "the" + "Position");



			System.out.println("###########-------------  THE PLAYER 1 IS WON ------------#########  ");
		}
	}
}

