package model.tile;

import view.Assets;

/**
 * the bottom left house tile which isn't a roof tile
 * 
 * @author NameG
 *
 */
public class HouseBottomLeft extends Tile {

	public HouseBottomLeft(int id) {
		super(Assets.houseBottomLeft, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
