package com.snakeladder.game;

public class SnakeLadderGame {

	// Constant
		public static final  int NO_PLAY=1;
		public static final int LADDER_PLAY=2;
		public static final	int SNAK_PLAY=3;
		public static final int Ladder_board=100;
	
		public static void main(String[] args) {
			System.out.println("WLCOME TO SNAKE LADDER GAME");
			// Variables

			int diesrolled;
			int newposition=0;
			int player1_position=0; 
			int c=0;
			while (player1_position <= Ladder_board ) {
				c++;
				System.out.println("No.ofcount"  +c+"  time ");
				diesrolled = (int) (Math.random()*6) + 1;
				System.out.println("DIES ROLLED" + diesrolled );

				int instruction = (int) (Math.random()*3+1);
				System.out.println("instruction" + instruction );

				if (player1_position == 100 ) {
					System.out.println("  ##############  YOU WIN ###########" );
					break;   }

				switch ((int)instruction )  {
				case  NO_PLAY :
					player1_position=player1_position + 0 ;
					break;

				case LADDER_PLAY :
					if (player1_position+diesrolled >100) {
						break;   }
					player1_position= player1_position + diesrolled;
					break;

				case SNAK_PLAY :{
					if (player1_position+diesrolled <0) {
						break;       }
					player1_position= (player1_position - diesrolled) ;
				}
				player1_position = player1_position ;


				}
				System.out.println("The value of PLAYER1_POSITION is  " + player1_position );
			}
			System.out.println("PLAYER 1 Now @ " + player1_position + "the" + "Position");



			System.out.println("###########-------------  THE PLAYER 1 IS WON ------------#########  ");
		}     
	}

