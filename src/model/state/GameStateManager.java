package model.state;

public class GameStateManager {
	private static State currentState = null;
	
	
	/**
	 * 
	 * @param state : sets the currentState to the
	 */
	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
}
