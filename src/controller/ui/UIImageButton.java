package controller.ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class UIImageButton extends UIObject{
	
	private BufferedImage[] images;
	private ClickListener clicker;

	public UIImageButton(float x, float y, int width, int height, BufferedImage[] images, ClickListener clicker) {
		super(x, y, width, height);
		this.images = images;
		this.clicker = clicker;
	}

	@Override
	public void tick() {
		
		
	}
	
	/**
	 * When hovering over the button change the button image to the second button image in the array else the first
	 */
	@Override
	public void render(Graphics g) {
		if(hovering)
			g.drawImage(images[1], (int) x, (int) y, width, height, null);
		else
			g.drawImage(images[0], (int) x, (int) y, width, height, null);
		
	}

	/**
	 * Do something on click
	 */
	@Override
	public void onClick() {
		clicker.onClick();		
	}
	
}
