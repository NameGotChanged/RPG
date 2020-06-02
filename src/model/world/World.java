package model.world;

import java.awt.Graphics;

import controller.GameController;
import controller.utils.Utils;
import model.tile.Tile;

public class World {
	
	private GameController game;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	
	public World(GameController game, String path) {
		this.game = game; //load first so it doesn't crash
		loadWorld(path);
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - game.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - game.getGameCamera().getyOffset()));
			}
		}
	}
	
	public Tile getTile(int x, int y) {
		//not so sure
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.dirtTile;
		return t;
		
	}
	
	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+"); //Splits up everything into seperate Strings
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y < height;y++) {
			for(int x = 0; x < width;x++) {
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) +4]); //4 has to be added because the first 4 lines aren't world data
			}
		}
	}
}
