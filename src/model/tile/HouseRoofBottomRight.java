package model.tile;

import view.Assets;

public class HouseRoofBottomRight extends Tile{

	public HouseRoofBottomRight(int id) {
		super(Assets.houseRoofBottomRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
