package model.ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import view.Assets;


public class UIBackground {
	private BufferedImage background;
	float x, y;
	int width, height;
	public UIBackground(float x, float y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.background = Assets.user_Interface_Background;
	}
	public void render(Graphics g){
		g.drawImage(background, (int)x, (int)y, width, height, null);
	}
}
