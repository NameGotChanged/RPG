package model.tile;

import view.Assets;

/**
 * The top and bottom WallTiles currently used to restrict the map
 * 
 * @author NameG
 *
 */
public class WallTileY extends Tile {

	public WallTileY(int id) {
		super(Assets.wallTileY, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}

}
