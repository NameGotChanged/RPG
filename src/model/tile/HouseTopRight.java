package model.tile;

import view.Assets;

/**
 * The top right Tile of the house which isn't a roof tile
 * 
 * @author NameG
 *
 */
public class HouseTopRight extends Tile {

	public HouseTopRight(int id) {
		super(Assets.houseTopRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
