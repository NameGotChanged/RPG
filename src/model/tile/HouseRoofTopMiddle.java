package model.tile;

import view.Assets;

public class HouseRoofTopMiddle extends Tile{

	public HouseRoofTopMiddle(int id) {
		super(Assets.houseRoofTopMiddle, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
