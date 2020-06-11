package model.state;

import java.awt.Graphics;

import controller.Handler;

/**
 * Abstract State class which is a template for current and future State classes
 * 
 * @author NameG
 *
 */
public abstract class State {

	protected Handler handler;

	public State(Handler handler) {
		this.handler = handler;
	}

	/**
	 * Updates game data
	 */
	public abstract void tick();

	/**
	 * Updates Display
	 * 
	 * @param g : Graphic object which later will get drawn onto the screen
	 */
	public abstract void render(Graphics g);

}
