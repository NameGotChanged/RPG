package model.enitity.creature.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import controller.Game;
import controller.Handler;
import model.character.Character_Player_Assets;
import model.enitity.creature.Creature;
import view.Animation;

public class Player extends Creature {
	
	//Animations
	private Animation animDown, animUp, animLeft, animRight;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 26; //Offset from the left of the player
		bounds.y = 40; //Offset from above of the player
		bounds.width = 20;
		bounds.height = 22;
		
		//Animations
		animDown = new Animation(500, Character_Player_Assets.player_move_down);
		animUp = new Animation(500, Character_Player_Assets.player_move_up);
		animLeft = new Animation(500, Character_Player_Assets.player_move_left);
		animRight = new Animation(500, Character_Player_Assets.player_move_right);
		
	}

	@Override
	public void tick() {
		//Animations
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
		//Movement
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}
	
	public void getInput() {
		xMove = 0;
		yMove = 0;
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null); //casting floats into int because the method only takes int
		
		/* Temporary Code to draw the hitBox of the player
		g.setColor(Color.RED);
		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
		*/
	}
	
	private BufferedImage getCurrentAnimationFrame() {
		if(xMove < 0) {
			return animLeft.getCurrentFrame();
		}else if(xMove > 0) {
			return animRight.getCurrentFrame();
		}else if(yMove < 0) {
			return animUp.getCurrentFrame();
		}else if(yMove > 0) {
			return animDown.getCurrentFrame();
		}else {
			return animDown.getCurrentFrame();
		}
	}

}
