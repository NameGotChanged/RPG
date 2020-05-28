package model.character;

import java.awt.Graphics;

public class Character_Player extends Character {
	
	/**
	 * ctor Player
	 * @param x : x position of the Player
	 * @param y : y position of the Player
	 * @param hp : health points of the Player
	 * @param def : defense stat of the Player
	 * @param dmg : damage stat of the Player
	 */
	public Character_Player(int x, int y, int hp, int def, int dmg, int speed) {
		super(x, y, hp, def, dmg, speed);
		this.player = Character_Player_Assets.characterMovingToTheRight;
	}
	
	/**
	 * Implements the Attack Function of the CharacterInterface
	 * Which is used to attack other Characters or NPC like Monster
	 */
	@Override
	public void attack() {
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

	@Override
	public void moveLeft() {
		this.setX(this.getX() - speed);
		this.player = Character_Player_Assets.characterMovingToTheLeft;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.setX(this.getX() + speed);
		this.player = Character_Player_Assets.characterMovingToTheRight;
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.setY(this.getY() - speed);
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		this.setY(this.getY() + speed);
		
	}

	@Override
	public void display(Graphics g) {
		g.drawImage(player, getX(), getY(), null);
	}
	
	
	
	
	
	
	}
