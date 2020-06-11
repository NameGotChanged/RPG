package model.tile;

import view.Assets;

/**
 * the top right house tile which is a roof tile
 * 
 * @author NameG
 *
 */
public class HouseRoofTopRight extends Tile {

	public HouseRoofTopRight(int id) {
		super(Assets.houseRoofTopRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
