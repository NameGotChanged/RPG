package main;

import controller.Game;

public class Main {
	/**
	 * Runs the Game(Controller) which does the logic between view and model.
	 * @param args : String array which stores all the command line arguments.
	 */
	public static void main(String[] args) {
		Game game = new Game("Ninoquarantino", 400, 400);
		game.start(); //Start the game thread
	}

}
