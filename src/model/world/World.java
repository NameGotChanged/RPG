package model.world;

import java.awt.Graphics;

import controller.Handler;
import model.enitity.EntityManager;
import model.enitity.creature.player.Player;
import model.enitity.creature.slime.Slime;
import model.enitity.staticEntity.Door;
import model.enitity.staticEntity.Tree;
import model.tile.Tile;
import utils.Utils;

public class World {
	
	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	//Entities
	private EntityManager entityManager;
	
	public World(Handler handler, String path) {
		this.handler = handler; //load first so it doesn't crash
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
		entityManager.addEntity(new Tree(handler, 250, 300));
		entityManager.addEntity(new Tree(handler, 600, 600));
		entityManager.addEntity(new Tree(handler, 800, 800));
		entityManager.addEntity(new Tree(handler, 1100, 400));
		entityManager.addEntity(new Tree(handler, 580, 300));
		entityManager.addEntity(new Tree(handler, 600, 600));
		entityManager.addEntity(new Door(handler, 448,448, width, 2*height));
		entityManager.addEntity(new Slime(handler, 400, 600, width, height));
		entityManager.addEntity(new Slime(handler, 450, 600, width, height));
		entityManager.addEntity(new Slime(handler, 400, 770, width, height));
		entityManager.addEntity(new Slime(handler, 500, 250, width, height));
		entityManager.addEntity(new Slime(handler, 800, 450, width, height));
		entityManager.addEntity(new Slime(handler, 480, 300, width, height));
		entityManager.addEntity(new Slime(handler, 600, 700, width, height));
		entityManager.addEntity(new Slime(handler, 80, 80, width, height));
		
		loadWorld(path);
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setX(spawnY);
	}
	
	public void tick() {
		entityManager.tick();
	}
	
	public void render(Graphics g) {
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset() / Tile.TILEWIDTH); //Left window border
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH +1); //Right window border
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset() / Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT +1);
		
		for(int y = yStart; y < yEnd; y++) {
			for(int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(g, (int) (x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		//Entities
		entityManager.render(g);
	}
	
	public Tile getTile(int x, int y) {
		//Don't want the game to crash
		if(x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grassTile;
		
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
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	
}
