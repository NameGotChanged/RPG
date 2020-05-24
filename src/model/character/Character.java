package model.character;

/**
 * abstract class that gives properties to Player and Monster class
 * @author NameG
 *
 */

public abstract class Character implements CharacterInterface {
	int x;
	int y;
	int hp;
	int def;
	int dmg;
	
	/**
	 * ctor Character
	 * @param x : x position of the Character
	 * @param y : y position of the Character
	 * @param hp : health points of the Character
	 * @param def : defense stat of the Character
	 * @param dmg : damage stat of the Character
	 */
	public Character(int x, int y, int hp, int def, int dmg){
		this.x = x;
		this.y = y;
		this.hp = hp;
		this.def = def;
		this.dmg = dmg;
	}
	
}
