package com.snakeladder.game;

public class SnakeLadderGame {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Snake Ladder Game");
		
		int dies;
		// result
		dies = (int) (Math.random()*6) + 1;
		System.out.println("the dice number is  :" + dies  );
	}
}
