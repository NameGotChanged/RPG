package view;

import java.awt.image.BufferedImage;

/**
 * Load in Assets once, so they don't have to be reloaded
 * @author NameG
 *
 */
public class Assets {
	private static final int width = 32;
	private static final int height = 32;
	
	//Load in playerIdle images
	public static BufferedImage playerIdle1, playerIdle2, playerIdle3, playerIdle4, playerIdle5, playerIdle6, playerIdle7, playerIdle8, playerIdle9, playerIdle10, playerIdle11, playerIdle12, playerIdle13;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Adventurer Sprite Sheet v1.1.png"));
		playerIdle1 = sheet.crop(0, 0, width, height);
		playerIdle2 = sheet.crop(width, 0, width, height);
		playerIdle3 = sheet.crop(2*width, 0, width, height);
		playerIdle4 = sheet.crop(3*width, 0, width, height);
		playerIdle5 = sheet.crop(4*width, 0, width, height);
		playerIdle6 = sheet.crop(5*width, 0, width, height);
		playerIdle7 = sheet.crop(6*width, 0, width, height);
		playerIdle8 = sheet.crop(7*width, 0, width, height);
		playerIdle9 = sheet.crop(8*width, 0, width, height);
		playerIdle10 = sheet.crop(9*width, 0, width, height);
		playerIdle11 = sheet.crop(10*width, 0, width, height);
		playerIdle12 = sheet.crop(11*width, 0, width, height);
		playerIdle13 = sheet.crop(12*width, 0, width, height);
	}
}
