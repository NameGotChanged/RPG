package model.tile;

import view.Assets;

/**
 * the top middle house tile which is a roof tile
 * 
 * @author NameG
 *
 */
public class HouseRoofTopMiddle extends Tile {

	public HouseRoofTopMiddle(int id) {
		super(Assets.houseRoofTopMiddle, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
