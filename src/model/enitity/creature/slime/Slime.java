package model.enitity.creature.slime;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.concurrent.ThreadLocalRandom;

import controller.Handler;
import model.enitity.creature.Creature;
import view.Animation;
import view.Assets;

/**
 * A cute little slime Creature
 * 
 * @author NameG
 *
 */
public class Slime extends Creature {

	private int randomMovement = ThreadLocalRandom.current().nextInt(0, 5 + 1);
	// Movement Animations
	private Animation animDown, animUp, animLeft, animRight;
	// Used to get a timer for random movement every 800ms
	private long lastMoveTimer, moveCooldown = 1600, moveTimer = moveCooldown;

	public Slime(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		animDown = new Animation(100, Assets.slimeMoveDown);
		animUp = new Animation(100, Assets.slimeMoveUp);
		animLeft = new Animation(100, Assets.slimeMoveLeft);
		animRight = new Animation(100, Assets.slimeMoveRight);
		this.speed = 1;

		bounds.x = 24; // Offset from the left of the player
		bounds.y = 20; // Offset from above of the player
		bounds.width = 20;
		bounds.height = 20;
	}

	@Override
	public void tick() {
		move();
		checkMovement();

		// Animations
		// Movement Animations
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
	}

	/**
	 * Randomly moves the little slimey boy
	 */
	public void checkMovement() {
		moveTimer += System.currentTimeMillis() - lastMoveTimer;
		lastMoveTimer = System.currentTimeMillis();
		if (moveTimer < moveCooldown) {
			if (randomMovement == 1) {
				yMove = -speed;
				return;
			}
			if (randomMovement == 2) {
				yMove = speed;
				return;
			}
			if (randomMovement == 3) {
				xMove = -speed;
				return;
			}
			if (randomMovement == 4) {
				xMove = speed;
				return;
			}
			if (randomMovement == 5) {
				xMove = 0;
				yMove = 0;
				return;
			}
		}
		randomMovement = ThreadLocalRandom.current().nextInt(0, 5 + 1);
		moveTimer = 0;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		/*
		 * g.setColor(Color.RED); g.fillRect((int) (x + bounds.x -
		 * handler.getGameCamera().getxOffset()),(int) (y + bounds.y -
		 * handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
		 */
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub

	}

	/**
	 * returns the current Image that needs to be rendered (drawn to the screen)
	 * 
	 * @return
	 */
	private BufferedImage getCurrentAnimationFrame() {
		if (xMove < 0) {
			return animLeft.getCurrentFrame();
		} else if (xMove > 0) {
			return animRight.getCurrentFrame();
		} else if (yMove < 0) {
			return animUp.getCurrentFrame();
		} else if (yMove > 0) {
			return animDown.getCurrentFrame();
		} else {
			return animDown.getCurrentFrame();
		}
	}
}
