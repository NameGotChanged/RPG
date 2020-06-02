package controller.state;

import java.awt.Graphics;

import controller.GameController;

public abstract class State {
	
	protected GameController game;
	
	public State(GameController game) {
		this.game = game;
	}
	
	
	
	public abstract void tick();
	public abstract void render(Graphics g);
}
