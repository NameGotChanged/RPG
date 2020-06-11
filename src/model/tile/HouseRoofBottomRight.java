package model.tile;

import view.Assets;

/**
 * the bottom right house tile which is a roof tile
 * 
 * @author NameG
 *
 */
public class HouseRoofBottomRight extends Tile {

	public HouseRoofBottomRight(int id) {
		super(Assets.houseRoofBottomRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
