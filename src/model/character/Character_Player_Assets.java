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
	
	//Load in player image
	public static BufferedImage characterMovingToTheLeft, characterMovingToTheRight;
	public static BufferedImage grass1, grass2, grass3, stone, dirt;
	
	public static void initPlayerSprites() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sprites.png"));
		characterMovingToTheLeft = sheet.crop(0, 10*height, width, height);
		characterMovingToTheRight = sheet.crop(0, 2*height, width, height);
	}
	
	public static void initTextures() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/textures.png"));
		grass1 = sheet.crop(0, 0, width, height);
		grass2 = sheet.crop(width, 0, width, height);
		grass3 = sheet.crop(2*width, 0, width, height);
		stone = sheet.crop(width, 8*height, width, height);
		dirt = sheet.crop(5*width, 0, width, height);
	}
}
