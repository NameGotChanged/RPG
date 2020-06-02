package controller.state;

import java.awt.Graphics;

import controller.GameController;
import model.character.Character_Player_Assets;
import model.enitity.creature.player.Player;
import model.tile.Tile;
import model.world.World;

public class GameState extends State {
	
	private Player player;
	private World world;
	
	public GameState(GameController game) {
		super(game);
		player = new Player(game, 100, 100);
		world = new World(game, "world1.txt");
		
		game.getGameCamera().move(0, 0);
	}

	@Override
	public void tick() {
		world.tick(); //change the world before changing player data
		player.tick();
		game.getGameCamera();
	}

	@Override
	public void render(Graphics g) {
		world.render(g); //render the world before rendering the player so the player gets drawn on top of the world
		player.render(g);
	}
	
}
