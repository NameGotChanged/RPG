package model.state;

public class GameStateManager {
	private static State currentState = null;

	/**
	 * 
	 * @param state : the state in which the game currently is
	 * 
	 */
	public static void setState(State state) {
		currentState = state;
	}

	public static State getState() {
		return currentState;
	}
}
