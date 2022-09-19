package com.snakeladder.game;

public class SnakeLadderGame {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Snake Ladder Game");
	
		// Variables
				int palyer1=0;
				int dies;
				int objective=0;
				// result

				dies = (int) (Math.random()*6) + 1;

				System.out.println("DIES" + dies );
				int instruction = (int) (Math.random()*3)+1;
				System.out.println("instruction" + instruction );

				switch ((int)instruction )
				{
				case  1 :
					System.out.println(" NO_PLAY ");
					objective=dies -(1 * dies) ;
					break;
				case 2 :
					System.out.println(" LADDER_PLAY ");
					objective= (1 * dies);
					break;
				case 3 :
					System.out.println(" SNAK_PLAY ");
					objective= -(1 * dies) ;
				}

				System.out.println("The value of instruction is  " + objective );
	}
}
