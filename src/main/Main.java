package main;

import controller.Game;

public class Main {
	/**
	 * Runs the GameController which does the logic between view and model.
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game("Ninoquarantino", 400, 400);
		game.start(); //Start the game thread
	}

}
