package model.enitity.staticEntity;

import java.awt.Graphics;

import controller.Handler;
import view.Assets;
import model.tile.Tile;

/**
 * Model of a tree
 * 
 * @author NameG
 *
 */
public class Tree extends StaticEntity {

	public Tree(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT * 2);

		bounds.x = 55;
		bounds.y = 90;
		bounds.width = 20;
		bounds.height = 30;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void die() {

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Assets.treeGreen, (int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		/*
		 * Temporary Code to draw the hitBox of the player g.setColor(Color.RED);
		 * g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),(int)
		 * (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width,
		 * bounds.height);
		 */
	}

}
