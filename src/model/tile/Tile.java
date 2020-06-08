package model.tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Tile {
	
	//STATIC VARIABLES
	
	public static Tile[] tiles = new Tile[256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile dirtTile = new DirtTile(1);
	public static Tile rockTile = new RockTile(2);
	public static Tile wallTileX = new WallTileX(3);
	public static Tile wallTileY = new WallTileY(4);
	public static Tile wallCornerTopLeft = new WallCornerTopLeft(5);
	public static Tile wallCornerTopRight = new WallCornerTopRight(6);
	public static Tile wallCornerBottomRight = new WallCornerBottomRight(7);
	public static Tile wallCornerBottomLeft = new WallCornerBottomLeft(8);
	
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	protected BufferedImage texture;
	protected final int id; //Every Tile should have a unique ID
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		//Sets the current TileObject to the ID specified in it and and assigns it the same id number in the array
		tiles[id] = this; //Look into this.
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public int getId() {
		return id;
	}
}
