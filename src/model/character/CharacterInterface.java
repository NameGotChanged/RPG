package model.character;
	/**
	 * Gives Methods to Characters to be implemented in classes like Player or Monster
	 * @author NameG
	 *
	 */
public interface CharacterInterface {
	/**
	 * Character attacks
	 */
	void attack();
	/**
	 * Moves Character
	 */
	public void move();
	/**
	 * Calculates the damage taken considering attacked character stats and attacking character stats.
	 * Some Calculations are needed bcs of the use of a defense stat
	 */
	public void damageTaken();
}
