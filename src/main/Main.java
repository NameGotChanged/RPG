package main;

import controller.GameController;

public class Main {
	/**
	 * Runs the GameController which does the logic between view and model.
	 * @param args
	 */
	public static void main(String[] args) {
		GameController game = new GameController("Ninoquarantino", 400, 400);
		game.start(); //Start the game thread
	}

}
