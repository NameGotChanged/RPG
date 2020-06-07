package model.character;

import java.awt.image.BufferedImage;

import view.ImageLoader;
import view.SpriteSheet;

/**
 * Load in Assets once, so they don't have to be reloaded
 * @author NameG
 *
 */
public class Character_Player_Assets {
	private static final int width = 32;
	private static final int height = 32;
	//Animation to move to the right
	public static BufferedImage[] player_move_right, player_move_left, player_move_up, player_move_down;
	
	//Load in player image
	public static BufferedImage characterMovingToTheLeft, characterMovingToTheRight, characterMovingUp, characterMovingDown;
	public static BufferedImage grass1, grass2, grass3, stone, dirt;
	public static BufferedImage treeGreen, treeDarkGreen, treeOrange;
	
	public static void initPlayerSprites() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sprites_new.png"));
		
		player_move_right = new BufferedImage[8];
		player_move_right[0] = sheet.crop(0, height, width, height);
		player_move_right[1] = sheet.crop(width, height, width, height);
		player_move_right[2] = sheet.crop(2*width, height, width, height);
		player_move_right[3] = sheet.crop(3*width, height, width, height);
		player_move_right[4] = sheet.crop(4*width, height, width, height);
		player_move_right[5] = sheet.crop(5*width, height, width, height);
		player_move_right[6] = sheet.crop(4*width, height, width, height);
		player_move_right[7] = sheet.crop(5*width, height, width, height);
		
		player_move_left = new BufferedImage[8];
		player_move_left[0] = sheet.crop(11*width, 6*height, width, height);
		player_move_left[1] = sheet.crop(10*width, 6*height, width, height);
		player_move_left[2] = sheet.crop(9*width, 6*height, width, height);
		player_move_left[3] = sheet.crop(8*width, 6*height, width, height);
		player_move_left[4] = sheet.crop(7*width, 6*height, width, height);
		player_move_left[5] = sheet.crop(6*width, 6*height, width, height);
		player_move_left[6] = sheet.crop(5*width, 6*height, width, height);
		player_move_left[7] = sheet.crop(4*width, 6*height, width, height);
		
		player_move_down = new BufferedImage[3];
		player_move_down[0] = sheet.crop(7*width, 7*height, width, height);
		player_move_down[1] = sheet.crop(8*width, 7*height, width, height);
		player_move_down[2] = sheet.crop(9*width, 7*height, width, height);
		
		player_move_up = new BufferedImage[3];
		player_move_up[0] = sheet.crop(8*width, height, width, height);
		player_move_up[1] = sheet.crop(9*width, height, width, height);
		player_move_up[2] = sheet.crop(10*width, height, width, height);
		
		
		
		characterMovingToTheLeft = sheet.crop(0, 10*height, width, height);
		characterMovingToTheRight = sheet.crop(0, 2*height, width, height);
		characterMovingUp = sheet.crop(2*width, 0, width, height);
		characterMovingDown = sheet.crop(9*width, 0, width, height);
		
	}
	
	public static void initTextures() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/textures.png"));
		grass1 = sheet.crop(0, 0, width, height);
		grass2 = sheet.crop(width, 0, width, height);
		grass3 = sheet.crop(2*width, 0, width, height);
		stone = sheet.crop(width, 8*height, width, height);
		dirt = sheet.crop(5*width, 0, width, height);
		treeGreen = sheet.crop(0, height, 2*width, 2*height);
		treeDarkGreen = sheet.crop(width, height, 2*width, 2*height);
		treeOrange = sheet.crop(2*width, height, 2*width, 2*height);
	}
}
