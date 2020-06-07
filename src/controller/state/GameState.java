package controller.state;

import java.awt.Graphics;

import controller.Game;
import controller.Handler;
import model.character.Character_Player_Assets;
import model.enitity.creature.player.Player;
import model.enitity.statics.Tree;
import model.tile.Tile;
import model.world.World;

public class GameState extends State {
	
	private World world;
	
	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "world1.txt");
		handler.setWorld(world);
	}

	@Override
	public void tick() {
		world.tick(); //change the world before changing player data
	}

	@Override
	public void render(Graphics g) {
		world.render(g); //render the world before rendering the player so the player gets drawn on top of the world
	}
	
}
