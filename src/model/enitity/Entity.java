package model.enitity;

import java.awt.Graphics;
import java.awt.Rectangle;

import controller.Handler;

/**
 * Abstract class which is the base of the staticEntities and the creatures
 * 
 * @author NameG
 *
 */
public abstract class Entity {

	public static final int DEFAULT_HEALTH = 10; // constant for the default health of every creature
	protected float x, y; // protected is similar to private but allows classes that extend this class to
							// use the protected variables
	protected int width, height;
	protected Handler handler;
	protected int health;
	protected boolean active = true; // The entity gets removed as soon as it isn't active anymore
	protected Rectangle bounds; // collision rect

	public Entity(Handler handler, float x, float y, int width, int height) {
		this.handler = handler;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		health = DEFAULT_HEALTH;

		bounds = new Rectangle(0, 0, width, height);
	}

	public abstract void tick();

	public abstract void render(Graphics g);

	public abstract void die();

	/**
	 * Reduces the health by the amount of dmg taken and if health <= 0 sets the
	 * active boolean to false which leads to the entity getting deleted from the
	 * EntityManager
	 * 
	 * @param amt : amount of Damage taken
	 */
	public void hurt(int amt) {
		health -= amt;
		if (health <= 0)
			active = false;
		die();
	}

	/*
	 * Tests this entity if it collides with another entity
	 */
	public boolean checkEntityCollision(float xOffset, float yOffset) {
		for (Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if (e.equals(this)) // skips this entity and checks all the other entities
				continue;
			if (e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
				return true;
		}
		return false;
	}

	/*
	 * Return collisionbox of the entity
	 */
	public Rectangle getCollisionBounds(float xOffset, float yOffset) {
		return new Rectangle((int) (x + bounds.x + xOffset), (int) (y + bounds.y + yOffset), bounds.width,
				bounds.height);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * if something isn't active it gets removed from the ArrayList
	 * 
	 * @return
	 */
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
