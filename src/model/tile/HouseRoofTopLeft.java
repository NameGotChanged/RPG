package model.tile;

import view.Assets;

public class HouseRoofTopLeft extends Tile{

	public HouseRoofTopLeft(int id) {
		super(Assets.houseRoofTopLeft, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
