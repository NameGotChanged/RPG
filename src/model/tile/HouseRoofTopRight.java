package model.tile;

import view.Assets;

public class HouseRoofTopRight extends Tile{

	public HouseRoofTopRight(int id) {
		super(Assets.houseRoofTopRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
