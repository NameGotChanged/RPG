package model.tile;

import view.Assets;

/**
 * the bottom right house tile which isn't a roof tile
 * 
 * @author NameG
 *
 */
public class HouseBottomRight extends Tile {

	public HouseBottomRight(int id) {
		super(Assets.houseBottomRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
