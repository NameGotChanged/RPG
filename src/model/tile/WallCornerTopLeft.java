package model.tile;

import view.Assets;

/**
 * The top left wall corner
 * 
 * @author NameG
 *
 */
public class WallCornerTopLeft extends Tile {

	public WallCornerTopLeft(int id) {
		super(Assets.wallCornerTopLeft, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
