package model.enitity.staticEntity;

import java.awt.Graphics;

import controller.Handler;
import model.tile.Tile;
import view.Assets;

/**
 * Model for the staticEntity Door
 * 
 * @author NameG
 *
 */
public class Door extends StaticEntity {

	public Door(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, Tile.TILEWIDTH, 2 * Tile.TILEHEIGHT);
		this.health = 10000;
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = 64;
		bounds.height = 128;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.door, (int) (x - handler.getGameCamera().getxOffset()),
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

}
