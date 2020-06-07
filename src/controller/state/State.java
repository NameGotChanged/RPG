package controller.state;

import java.awt.Graphics;

import controller.Game;
import controller.Handler;

public abstract class State {
	
	protected Handler handler;
	
	public State(Handler handler) {
		this.handler = handler;
	}
	
	
	
	public abstract void tick();
	public abstract void render(Graphics g);
}
