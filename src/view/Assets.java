package view;

import java.awt.image.BufferedImage;

import view.ImageLoader;
import view.SpriteSheet;

/**
 * Load in Assets once, so they don't have to be reloaded
 * @author NameG
 *
 */
public class Assets {
	private static final int width = 32;
	private static final int height = 32;
	//Animation
	//Movement Animations
	public static BufferedImage[] player_move_right, player_move_left, player_move_up, player_move_down;
	//Attack Animations
	public static BufferedImage[] player_move_right_attack, player_move_left_attack, player_move_down_attack;
	
	//UI and UI_Button_Hover images
	public static BufferedImage[] user_Interface_Button;
	//UI Background
	public static BufferedImage user_Interface_Background;
	
	//Textures
	public static BufferedImage grass1, grass2, grass3, stone, dirt;
	public static BufferedImage treeGreen, treeDarkGreen, treeOrange;
	public static BufferedImage[] house;
	
	//WallTile in X und Y richtung & corner
	public static BufferedImage wallTileX, wallTileY, wallCornerBottomRight, wallCornerBottomLeft, wallCornerTopRight, wallCornerTopLeft;
	
	public static void initPlayerSprites() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sprites_new.png"));
		
		//Attack
		player_move_right_attack = new BufferedImage[10];
		player_move_right_attack[0] = sheet.crop(0, 3*height, width, height);
		player_move_right_attack[1] = sheet.crop(width, 3*height, width, height);
		player_move_right_attack[2] = sheet.crop(2*width, 3*height, width, height);
		player_move_right_attack[3] = sheet.crop(3*width, 3*height, width, height);
		player_move_right_attack[4] = sheet.crop(4*width, 3*height, width, height);
		player_move_right_attack[5] = sheet.crop(5*width, 3*height, width, height);
		player_move_right_attack[6] = sheet.crop(6*width, 3*height, width, height);
		player_move_right_attack[7] = sheet.crop(7*width, 3*height, width, height);
		player_move_right_attack[8] = sheet.crop(8*width, 3*height, width, height);
		player_move_right_attack[9] = sheet.crop(9*width, 3*height, width, height);
		
		player_move_left_attack = new BufferedImage[10];
		player_move_left_attack[9] = sheet.crop(0, 11*height, width, height);
		player_move_left_attack[8] = sheet.crop(width, 11*height, width, height);
		player_move_left_attack[7] = sheet.crop(2*width, 11*height, width, height);
		player_move_left_attack[6] = sheet.crop(3*width, 11*height, width, height);
		player_move_left_attack[5] = sheet.crop(4*width, 11*height, width, height);
		player_move_left_attack[4] = sheet.crop(5*width, 11*height, width, height);
		player_move_left_attack[3] = sheet.crop(6*width, 11*height, width, height);
		player_move_left_attack[2] = sheet.crop(7*width, 11*height, width, height);
		player_move_left_attack[1] = sheet.crop(8*width, 11*height, width, height);
		player_move_left_attack[0] = sheet.crop(9*width, 11*height, width, height);
		
		player_move_down_attack = new BufferedImage[10];
		player_move_down_attack[0] = sheet.crop(0, 12*height, width, height);
		player_move_down_attack[1] = sheet.crop(width, 12*height, width, height);
		player_move_down_attack[2] = sheet.crop(2*width, 12*height, width, height);
		player_move_down_attack[3] = sheet.crop(3*width, 12*height, width, height);
		player_move_down_attack[4] = sheet.crop(4*width, 12*height, width, height);
		player_move_down_attack[5] = sheet.crop(5*width, 12*height, width, height);
		player_move_down_attack[6] = sheet.crop(6*width, 12*height, width, height);
		player_move_down_attack[7] = sheet.crop(7*width, 12*height, width, height);
		player_move_down_attack[8] = sheet.crop(8*width, 12*height, width, height);
		player_move_down_attack[9] = sheet.crop(9*width, 12*height, width, height);
		
		
		//Movement
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
		wallTileX = sheet.crop(0, 27*height, width, height);
		wallTileY = sheet.crop(0, 26*height, width, height);
		wallCornerBottomRight = sheet.crop(3*width, 27*height, width, height);
		wallCornerBottomLeft = sheet.crop(2*width, 27*height, width, height);
		wallCornerTopRight = sheet.crop(3*width, 26*height, width, height);
		wallCornerTopLeft = sheet.crop(2*width, 26*height, width, height);
		
		house = new BufferedImage[10];
		//house[0] = sheet.crop(x, y, width, 42*height);
		
	}
	
	public static void initUserInterfaceTextures() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/game_ui_buttons.png"));
		user_Interface_Button = new BufferedImage[2];
		user_Interface_Button[0] = sheet.crop(0, 5, 145, 80);
		user_Interface_Button[1] = sheet.crop(0, 90, 145, 80);
		
	}
	
	public static void initUserInterfaceBackground() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/game_ui_background.png"));
		user_Interface_Background = sheet.crop(840, height+250, 400, 400);
	}
}
