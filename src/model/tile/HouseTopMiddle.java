package model.tile;

import view.Assets;

/**
 * The top middle tile of the house which isn't a roof tile
 * 
 * @author NameG
 *
 */
public class HouseTopMiddle extends Tile {

	public HouseTopMiddle(int id) {
		super(Assets.houseTopMiddle, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
