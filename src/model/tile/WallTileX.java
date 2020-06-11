package model.tile;

import view.Assets;

/**
 * The left and right Walls that are currently used to restrict the world
 * 
 * @author NameG
 *
 */

public class WallTileX extends Tile {

	public WallTileX(int id) {
		super(Assets.wallTileX, id);

	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
