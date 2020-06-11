package model.state;

import java.awt.Graphics;
import controller.Handler;
import model.world.World;

/**
 * The Game state is the state in which the game runs
 * 
 * @author NameG
 *
 */

public class GameState extends State {

	private World world;

	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "world1.txt");
		handler.setWorld(world);
	}

	/**
	 * Updates game data
	 */
	@Override
	public void tick() {
		world.tick(); // change the world before changing player data
	}

	/**
	 * Updates the display
	 */
	@Override
	public void render(Graphics g) {
		world.render(g); // render the world before rendering the player so the player gets drawn on top
							// of the world
	}

}
