package com.in28minutes.oops.level2.interfaces;

public class GameRunner {
	public static void main(String[] args) {
		MarioGame game = new MarioGame();
		game.up();
		game.down();
		game.left();
		game.right();

		ChessGame chessgame = new ChessGame();
		chessgame.up();
		chessgame.down();
		chessgame.left();
		chessgame.right();
	}
}
