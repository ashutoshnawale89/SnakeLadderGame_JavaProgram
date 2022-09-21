package com.snakeladder.game;

public class SnakeLadderGame {

	// Constant
		public static final  int NO_PLAY=1;
		public static final int LADDER_PLAY=2;
		public static final	int SNAK_PLAY=3;
		public static final int Ladder_Board=100;
	
		public static void main(String[] args) {
			System.out.println("WLCOME TO SNAKE LADDER GAME");
			// Variables

			int diesrolled;
			int player1_Position=0;
			int player2_Position=0;
			int count=0;
			while (player1_Position <= Ladder_Board && player2_Position <= Ladder_Board) {
				count++;
				int position=0;
				System.out.println("No.ofcount"  +count+"  time ");
				diesrolled = (int) (Math.random()*6) + 1;
				System.out.println("DIES ROLLED" + diesrolled );

				int instruction = (int) (Math.random()*3+1);
				System.out.println("instruction" + instruction );
                
				if (player1_Position == 100 ) {
					System.out.println("  ##############  YOU WIN Player 1###########" );
					break;   }
				
				if (player2_Position == 100 ) {
					System.out.println("  ##############  YOU WIN  Player 2###########" );
					break;   }

				switch ((int)instruction )  {
				case  NO_PLAY :
					position= 0 ;
					break;

				case LADDER_PLAY :
					if (player1_Position+diesrolled >100 && player2_Position+diesrolled > 100) {
						break;   }
					position= diesrolled;
					break;

				case SNAK_PLAY :{
					if (player1_Position+diesrolled <0 && player2_Position+diesrolled < 0) {
						break;       }
					position= (0 - diesrolled) ;
				}
				}
				if ((count%2)==0) {
					player2_Position=player2_Position+diesrolled;
					System.out.println("The value of PLAYER 2_POSITION is  " + player2_Position );		
					System.out.println("PLAYER 2 Now @ " + player2_Position + "the" + "Position");
				System.out.println(" ********************************************************* ");
				}
				else {
					player1_Position=player1_Position+diesrolled;
					System.out.println("The value of PLAYER 1_POSITION is  " + player1_Position );		
					System.out.println("PLAYER 1 Now @ " + player1_Position + "the" + "Position");
					System.out.println(" ********************************************************* ");
				}
				
			}
		}
}


