package view;

import java.awt.image.BufferedImage;

import view.ImageLoader;
import view.SpriteSheet;

/**
 * Load in Assets once, so they don't have to be reloaded
 * 
 * @author NameG
 *
 */
public class Assets {
	private static final int width = 32;
	private static final int height = 32;
	// Animation
	// Player Movement Animations
	public static BufferedImage[] playerMoveRight, playerMoveLeft, playerMoveUp, playerMoveDown;
	// Player Attack Animations
	public static BufferedImage[] playerMoveRightAttack, playerMoveLeftAttack, playerMoveDownAttack;
	// Slime Movement Animation
	public static BufferedImage[] slimeMoveRight, slimeMoveLeft, slimeMoveUp, slimeMoveDown;

	// UI and UI_Button_Hover images
	public static BufferedImage[] userInterfaceButton;
	// UI Background
	public static BufferedImage userInterfaceBackground;

	// Textures
	public static BufferedImage grassGreen, grassDarkGreen, grassLightGreen, stone, dirt;
	public static BufferedImage treeGreen, treeDarkGreen, treeOrange;
	// House
	public static BufferedImage houseRoofTopLeft, houseRoofTopMiddle, houseRoofTopRight, houseRoofBottomLeft,
			houseRoofBottomMiddle, houseRoofBottomRight, houseTopLeft, houseTopMiddle, houseTopRight, houseBottomLeft,
			houseBottomMiddle, houseBottomRight, door;

	// WallTile in X und Y richtung & corner
	public static BufferedImage wallTileX, wallTileY, wallCornerBottomRight, wallCornerBottomLeft, wallCornerTopRight,
			wallCornerTopLeft;

	public static void initPlayerSprites() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sprites_new.png"));

		// Attack
		playerMoveRightAttack = new BufferedImage[10];
		playerMoveRightAttack[0] = sheet.crop(0, 3 * height, width, height);
		playerMoveRightAttack[1] = sheet.crop(width, 3 * height, width, height);
		playerMoveRightAttack[2] = sheet.crop(2 * width, 3 * height, width, height);
		playerMoveRightAttack[3] = sheet.crop(3 * width, 3 * height, width, height);
		playerMoveRightAttack[4] = sheet.crop(4 * width, 3 * height, width, height);
		playerMoveRightAttack[5] = sheet.crop(5 * width, 3 * height, width, height);
		playerMoveRightAttack[6] = sheet.crop(6 * width, 3 * height, width, height);
		playerMoveRightAttack[7] = sheet.crop(7 * width, 3 * height, width, height);
		playerMoveRightAttack[8] = sheet.crop(8 * width, 3 * height, width, height);
		playerMoveRightAttack[9] = sheet.crop(9 * width, 3 * height, width, height);

		playerMoveLeftAttack = new BufferedImage[10];
		playerMoveLeftAttack[0] = sheet.crop(0, 11 * height, width, height);
		playerMoveLeftAttack[1] = sheet.crop(width, 11 * height, width, height);
		playerMoveLeftAttack[2] = sheet.crop(2 * width, 11 * height, width, height);
		playerMoveLeftAttack[3] = sheet.crop(3 * width, 11 * height, width, height);
		playerMoveLeftAttack[4] = sheet.crop(4 * width, 11 * height, width, height);
		playerMoveLeftAttack[5] = sheet.crop(5 * width, 11 * height, width, height);
		playerMoveLeftAttack[6] = sheet.crop(6 * width, 11 * height, width, height);
		playerMoveLeftAttack[7] = sheet.crop(7 * width, 11 * height, width, height);
		playerMoveLeftAttack[8] = sheet.crop(8 * width, 11 * height, width, height);
		playerMoveLeftAttack[9] = sheet.crop(9 * width, 11 * height, width, height);

		playerMoveDownAttack = new BufferedImage[10];
		playerMoveDownAttack[0] = sheet.crop(0, 12 * height, width, height);
		playerMoveDownAttack[1] = sheet.crop(width, 12 * height, width, height);
		playerMoveDownAttack[2] = sheet.crop(2 * width, 12 * height, width, height);
		playerMoveDownAttack[3] = sheet.crop(3 * width, 12 * height, width, height);
		playerMoveDownAttack[4] = sheet.crop(4 * width, 12 * height, width, height);
		playerMoveDownAttack[5] = sheet.crop(5 * width, 12 * height, width, height);
		playerMoveDownAttack[6] = sheet.crop(6 * width, 12 * height, width, height);
		playerMoveDownAttack[7] = sheet.crop(7 * width, 12 * height, width, height);
		playerMoveDownAttack[8] = sheet.crop(8 * width, 12 * height, width, height);
		playerMoveDownAttack[9] = sheet.crop(9 * width, 12 * height, width, height);

		// Movement
		playerMoveRight = new BufferedImage[8];
		playerMoveRight[0] = sheet.crop(0, height, width, height);
		playerMoveRight[1] = sheet.crop(width, height, width, height);
		playerMoveRight[2] = sheet.crop(2 * width, height, width, height);
		playerMoveRight[3] = sheet.crop(3 * width, height, width, height);
		playerMoveRight[4] = sheet.crop(4 * width, height, width, height);
		playerMoveRight[5] = sheet.crop(5 * width, height, width, height);
		playerMoveRight[6] = sheet.crop(4 * width, height, width, height);
		playerMoveRight[7] = sheet.crop(5 * width, height, width, height);

		playerMoveLeft = new BufferedImage[8];
		playerMoveLeft[0] = sheet.crop(11 * width, 6 * height, width, height);
		playerMoveLeft[1] = sheet.crop(10 * width, 6 * height, width, height);
		playerMoveLeft[2] = sheet.crop(9 * width, 6 * height, width, height);
		playerMoveLeft[3] = sheet.crop(8 * width, 6 * height, width, height);
		playerMoveLeft[4] = sheet.crop(7 * width, 6 * height, width, height);
		playerMoveLeft[5] = sheet.crop(6 * width, 6 * height, width, height);
		playerMoveLeft[6] = sheet.crop(5 * width, 6 * height, width, height);
		playerMoveLeft[7] = sheet.crop(4 * width, 6 * height, width, height);

		playerMoveDown = new BufferedImage[3];
		playerMoveDown[0] = sheet.crop(7 * width, 7 * height, width, height);
		playerMoveDown[1] = sheet.crop(8 * width, 7 * height, width, height);
		playerMoveDown[2] = sheet.crop(9 * width, 7 * height, width, height);

		playerMoveUp = new BufferedImage[3];
		playerMoveUp[0] = sheet.crop(8 * width, height, width, height);
		playerMoveUp[1] = sheet.crop(9 * width, height, width, height);
		playerMoveUp[2] = sheet.crop(10 * width, height, width, height);
	}

	public static void initSlimeSprites() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/slime_small_blue.png"));
		slimeMoveDown = new BufferedImage[2];
		slimeMoveDown[0] = sheet.crop(0, 0, width, height);
		slimeMoveDown[1] = sheet.crop(width, 0, width, height);

		slimeMoveRight = new BufferedImage[2];
		slimeMoveRight[0] = sheet.crop(0, height, width, height);
		slimeMoveRight[1] = sheet.crop(width, height, width, height);

		slimeMoveUp = new BufferedImage[2];
		slimeMoveUp[0] = sheet.crop(0, 2 * height, width, height);
		slimeMoveUp[1] = sheet.crop(width, 2 * height, width, height);

		slimeMoveLeft = new BufferedImage[2];
		slimeMoveLeft[0] = sheet.crop(0, 3 * height, width, height);
		slimeMoveLeft[1] = sheet.crop(width, 3 * height, width, height);
	}

	public static void initTextures() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/textures.png"));
		grassGreen = sheet.crop(0, 0, width, height);
		grassDarkGreen = sheet.crop(width, 0, width, height);
		grassLightGreen = sheet.crop(2 * width, 0, width, height);
		stone = sheet.crop(width, 8 * height, width, height);
		dirt = sheet.crop(5 * width, 0, width, height);
		treeGreen = sheet.crop(0, height, 2 * width, 2 * height);
		treeDarkGreen = sheet.crop(width, height, 2 * width, 2 * height);
		treeOrange = sheet.crop(2 * width, height, 2 * width, 2 * height);
		wallTileX = sheet.crop(0, 27 * height, width, height);
		wallTileY = sheet.crop(0, 26 * height, width, height);
		wallCornerBottomRight = sheet.crop(3 * width, 27 * height, width, height);
		wallCornerBottomLeft = sheet.crop(2 * width, 27 * height, width, height);
		wallCornerTopRight = sheet.crop(3 * width, 26 * height, width, height);
		wallCornerTopLeft = sheet.crop(2 * width, 26 * height, width, height);

		houseRoofTopLeft = sheet.crop(0, 44 * height, width, height);
		houseRoofTopMiddle = sheet.crop(width, 44 * height, width, height);
		houseRoofTopRight = sheet.crop(2 * width, 44 * height, width, height);
		houseRoofBottomLeft = sheet.crop(0, 45 * height, width, height);
		houseRoofBottomMiddle = sheet.crop(width, 45 * height, width, height);
		houseRoofBottomRight = sheet.crop(2 * width, 45 * height, width, height);
		houseTopLeft = sheet.crop(0, 46 * height, width, height);
		houseTopMiddle = sheet.crop(width, 46 * height, width, height);
		houseTopRight = sheet.crop(2 * width, 46 * height, width, height);
		houseBottomLeft = sheet.crop(0, 47 * height, width, height);
		houseBottomMiddle = sheet.crop(width, 47 * height, width, height);
		houseBottomRight = sheet.crop(2 * width, 47 * height, width, height);
		door = sheet.crop(7 * width, 46 * height, width, 2 * height);

	}

	public static void initUserInterfaceTextures() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/game_ui_buttons.png"));
		userInterfaceButton = new BufferedImage[2];
		userInterfaceButton[0] = sheet.crop(0, 5, 145, 80);
		userInterfaceButton[1] = sheet.crop(0, 90, 145, 80);

	}

	public static void initUserInterfaceBackground() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/game_ui_background.png"));
		userInterfaceBackground = sheet.crop(840, height + 250, 400, 400);
	}
}
