package model.enitity.creature.player;

import java.awt.Graphics;

import controller.GameController;
import model.character.Character_Player_Assets;
import model.enitity.creature.Creature;

public class Player extends Creature {
	
	public Player(GameController game, float x, float y) {
		super(game, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
	}

	@Override
	public void tick() {
		getInput();
		move();
	}
	
	public void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(game.getKeyManager().up)
			yMove = -speed;
		if(game.getKeyManager().down)
			yMove = speed;
		if(game.getKeyManager().left)
			xMove = -speed;
		if(game.getKeyManager().right)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Character_Player_Assets.characterMovingToTheLeft, (int) x, (int) y, width, height, null); //casting floats into int because the method only takes int
	}

}
