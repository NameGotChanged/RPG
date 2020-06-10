package model.enitity.creature.player;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import controller.Handler;
import view.Assets;
import model.enitity.Entity;
import model.enitity.creature.Creature;
import view.Animation;

public class Player extends Creature {
	
	//Animations
	//Movement Animations
	private Animation animDown, animUp, animLeft, animRight;
	//Attack Animations
	private Animation animDownAttack, animLeftAttack, animRightAttack;
	//Attack timer in ms
	private long lastAttackTimer, attackCooldown = 400, attackTimer = attackCooldown;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 26; //Offset from the left of the player
		bounds.y = 40; //Offset from above of the player
		bounds.width = 20;
		bounds.height = 22;
		
		//Animations
		//Movement Animations
		animDown = new Animation(100, Assets.player_move_down);
		animUp = new Animation(100, Assets.player_move_up);
		animLeft = new Animation(100, Assets.player_move_left);
		animRight = new Animation(100, Assets.player_move_right);
		//Attack Animations
		animDownAttack = new Animation(100, Assets.player_move_down_attack);
		animLeftAttack = new Animation(100, Assets.player_move_left_attack);
		animRightAttack = new Animation(100, Assets.player_move_right_attack);
		
	}

	@Override
	public void tick() {
		//Animations
		//Movement Animations
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
		//Attack Animations
		animDownAttack.tick();
		animLeftAttack.tick();
		animRightAttack.tick();
		//Movement
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
		//Attack
		checkAttacks();
	}
	
	private void checkAttacks() {
		attackTimer += System.currentTimeMillis() - lastAttackTimer;
		lastAttackTimer = System.currentTimeMillis();
		if(attackTimer < attackCooldown)
			return; //don't run code below
		
		Rectangle cb = getCollisionBounds(0, 0); //Collision bounds
		Rectangle ar = new Rectangle(); //Attack Rectangle
		int arSize = 20;
		ar.width = arSize;
		ar.height = arSize;
		
		if(handler.getKeyManager().aSpace && handler.getKeyManager().up) {
			ar.x = cb.x + cb.width / 2 - arSize / 2;
			ar.y = cb.y - arSize;
		}else if(handler.getKeyManager().aSpace && handler.getKeyManager().down) {
			ar.x = cb.x + cb.width / 2 - arSize / 2;
			ar.y = cb.y + cb.height;
		}else if(handler.getKeyManager().aSpace && handler.getKeyManager().left) {
			ar.x = cb.x - arSize;
			ar.y = cb.y + cb.height / 2 - arSize / 2;
		}
		else if(handler.getKeyManager().aSpace && handler.getKeyManager().right) {
			ar.x = cb.x + cb.width;
			ar.y = cb.y + cb.height / 2 - arSize / 2;
		}else {
			return;
		}
		
		attackTimer = 0;
		
		for(Entity e : handler.getWorld().getEntityManager().getEntities()) {
			if(e.equals(this))
				continue; //if the entity is this Player object continue to the next Entity
			if(e.getCollisionBounds(0, 0).intersects(ar)) {
				e.hurt(2);
				return;
			}
		}
	}
	
	@Override
	public void die() {
		System.out.println("You Dead!");
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
		
		// Temporary Code to draw the hitBox of the player
		/*
		g.setColor(Color.RED);
		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
		*/
	}
	
	private BufferedImage getCurrentAnimationFrame() {
		if(xMove < 0 && handler.getKeyManager().aSpace) {
			return animLeftAttack.getCurrentFrame();
		}else if(xMove < 0) {
			return animLeft.getCurrentFrame();
		}else if(xMove > 0 && handler.getKeyManager().aSpace) {
			return animRightAttack.getCurrentFrame();
		}else if(xMove > 0) {
			return animRight.getCurrentFrame();
		}else if(yMove < 0) {
			return animUp.getCurrentFrame();
		}else if(yMove > 0 && handler.getKeyManager().aSpace) {
			return animDownAttack.getCurrentFrame();
		}else if(yMove > 0) {
			return animDown.getCurrentFrame();
		}else {
			return animDown.getCurrentFrame();
		}
	}

}
