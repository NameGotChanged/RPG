package model.camera;

import controller.Handler;
import model.enitity.Entity;
import model.tile.Tile;

public class GameCamera {

	private float xOffset, yOffset;
	private Handler handler;

	/*
	 * Offsets camera based on movement
	 */
	public GameCamera(Handler handler, float xOffset, float yOffset) {
		this.handler = handler;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}

	/**
	 * Checks if the Camera is showing us blank space if it is don't show the blank
	 * space
	 * 
	 */
	public void checkBlankSpace() {
		if (xOffset < 0) { // When the Camera is on the edge of the Screen don't show anything beyond the
							// edge
			xOffset = 0;
		} else if (xOffset > handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth()) {
			xOffset = handler.getWorld().getWidth() * Tile.TILEWIDTH - handler.getWidth();
		}

		if (yOffset < 0) {
			yOffset = 0;
		} else if (yOffset > handler.getWorld().getHeight() * Tile.TILEHEIGHT - handler.getHeight()) {
			yOffset = handler.getWorld().getWidth() * Tile.TILEHEIGHT - handler.getHeight();
		}
	}

	/**
	 * Center the camera on the player
	 * 
	 * @param e
	 */
	public void centerOnEntity(Entity e) {
		xOffset = e.getX() - handler.getWidth() / 2 + e.getWidth() / 2;
		yOffset = e.getY() - handler.getHeight() / 2 + e.getHeight();
		checkBlankSpace();
	}

	/**
	 * moves the camera
	 * 
	 * @param xAmt
	 * @param yAmt
	 */
	public void move(float xAmt, float yAmt) {
		xOffset += xAmt;
		yOffset += yAmt;
		checkBlankSpace();
	}

	// Getters and setters

	public float getxOffset() {
		return xOffset;
	}

	public void setxOffset(float xOffset) {
		this.xOffset = xOffset;
	}

	public float getyOffset() {
		return yOffset;
	}

	public void setyOffset(float yOffset) {
		this.yOffset = yOffset;
	}

}
