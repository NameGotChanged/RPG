package model.tile;

import view.Assets;

/**
 * the bottom middle house tile which isn't a roof tile
 * 
 * @author NameG
 *
 */
public class HouseBottomMiddle extends Tile {

	public HouseBottomMiddle(int id) {
		super(Assets.houseBottomMiddle, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
