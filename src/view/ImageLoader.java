package view;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Loads images and interprets them
 * @author NameG
 *
 */
public class ImageLoader {
	public static BufferedImage loadImage(String imagePath) {
		try {
			return ImageIO.read(ImageLoader.class.getResource(imagePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System Code one means the Image didn't load.
			System.exit(1);
		}
		return null;
	} 
}
