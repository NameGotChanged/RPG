package model.character;

public class Character_Player extends Character {
	
	/**
	 * ctor Player
	 * @param x : x position of the Player
	 * @param y : y position of the Player
	 * @param hp : health points of the Player
	 * @param def : defense stat of the Player
	 * @param dmg : damage stat of the Player
	 */
	public Character_Player(int x, int y, int hp, int def, int dmg) {
		super(x, y, hp, def, dmg);
		
	}
	
	/**
	 * Implements the Attack Function of the CharacterInterface
	 * Which is used to attack other Characters or NPC like Monster
	 */
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Implements the Move Function of the CharacterInterface
	 * Which is used to move the Character which in this case is a Player-Character
	 */
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void damageTaken() {
		//reduces the HP of the Player taking into account the def stat of the player
	}
	
	/**
	 * @return returns true if player chose the correct answer to a Quest
	 */
	public boolean answerQuest() {
		return false;
	}
	
	/**
	 * @return returns true if Quest got accepted by player
	 */
	public boolean acceptQuest() {
		return false;
	}

	
}
