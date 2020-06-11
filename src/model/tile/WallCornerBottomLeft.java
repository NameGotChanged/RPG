package model.tile;

import view.Assets;

/**
 * bottom left wall corner
 * 
 * @author NameG
 *
 */
public class WallCornerBottomLeft extends Tile {

	public WallCornerBottomLeft(int id) {
		super(Assets.wallCornerBottomLeft, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}

}
