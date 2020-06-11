package model.tile;

import view.Assets;

/**
 * Bottom right wall corner
 * 
 * @author NameG
 *
 */

public class WallCornerBottomRight extends Tile {

	public WallCornerBottomRight(int id) {
		super(Assets.wallCornerBottomRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
