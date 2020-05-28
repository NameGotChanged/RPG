package model.character;

import java.awt.Graphics;

/**
	 * Gives Methods to Characters to be implemented in classes like Player or Monster
	 * @author NameG
	 *
	 */
public interface Character_Interface {
	/**
	 * Character attacks
	 */
	void attack();
	/**
	 * Moves Character to the left
	 */
	public void moveLeft();
	/**
	 * Moves Character to the right
	 */
	public void moveRight();
	/**
	 * Moves Character up
	 */
	public void moveUp();
	/**
	 * Moves Character down
	 */
	public void moveDown();
	/**
	 * Calculates the damage taken considering attacked character stats and attacking character stats.
	 * Some Calculations are needed because of the use of a defense stat
	 */
	public void damageTaken();
	/**
	 * 
	 * @return : Returns the Graphics Object
	 */
	public void display(Graphics g);
}
