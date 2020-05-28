package model.character;

import java.awt.image.BufferedImage;

/**
 * abstract class that gives properties to Player and Monster class
 * @author NameG
 *
 */

public abstract class Character implements Character_Interface {
	private int x;
	private int y;
	int hp;
	int def;
	int dmg;
	int speed;
	BufferedImage player;
	
	/**
	 * ctor Character
	 * @param x : x position of the Character
	 * @param y : y position of the Character
	 * @param hp : health points of the Character
	 * @param def : defense stat of the Character
	 * @param dmg : damage stat of the Character
	 */
	public Character(int x, int y, int hp, int def, int dmg, int speed){
		this.x = x;
		this.y = y;
		this.hp = hp;
		this.def = def;
		this.dmg = dmg;
		this.speed = speed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
