package model.tile;

import view.Assets;

/**
 * the bottom left tile which is a roof tile
 * 
 * @author NameG
 *
 */
public class HouseRoofBottomLeft extends Tile {

	public HouseRoofBottomLeft(int id) {
		super(Assets.houseRoofBottomLeft, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
