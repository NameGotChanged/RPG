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
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Adventurer Sprite Sheet v1.1.png"));
		characterMovingToTheLeft = sheet.crop(0, 10*height, width, height);
		characterMovingToTheRight = sheet.crop(0, 2*height, width, height);
	}
}
