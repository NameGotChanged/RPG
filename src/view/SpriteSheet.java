package view;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	private BufferedImage sheet;

	public SpriteSheet(BufferedImage sheet) {
		this.sheet = sheet;
	}

	/**
	 * Cut out the Image we need
	 * 
	 * @return : returns cut out image
	 */
	public BufferedImage crop(int x, int y, int width, int height) {
		return sheet.getSubimage(x, y, width, height);
	}
}
