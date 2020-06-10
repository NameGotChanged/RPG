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
	public static Tile houseRoofTopLeft = new HouseRoofTopLeft(9);
	public static Tile houseRoofTopMiddle = new HouseRoofTopMiddle(10);
	public static Tile houseRoofTopRight = new HouseRoofTopRight(11);
	public static Tile houseRoofBottomLeft = new HouseRoofBottomLeft(12);
	public static Tile houseRoofBottomMiddle = new HouseRoofBottomMiddle(13);
	public static Tile houseRoofBottomRight = new HouseRoofBottomRight(14);
	public static Tile houseTopLeft = new HouseTopLeft(15);
	public static Tile houseTopMiddle = new HouseTopMiddle(16);
	public static Tile houseTopRight = new HouseTopRight(17);
	public static Tile houseBottomLeft = new HouseBottomLeft(18);
	public static Tile houseBottomMiddle = new HouseBottomMiddle(19);
	public static Tile houseBottomRight = new HouseBottomRight(20);
	
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
