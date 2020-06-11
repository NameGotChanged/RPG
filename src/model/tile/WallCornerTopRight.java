package model.tile;

import view.Assets;

/**
 * The corner of the top right side of the Wall
 * 
 * @author NameG
 *
 */
public class WallCornerTopRight extends Tile {

	public WallCornerTopRight(int id) {
		super(Assets.wallCornerTopRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
