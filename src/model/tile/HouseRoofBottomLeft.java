package model.tile;

import view.Assets;

public class HouseRoofBottomLeft extends Tile{

	public HouseRoofBottomLeft(int id) {
		super(Assets.houseRoofBottomLeft, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
