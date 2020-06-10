package model.tile;

import view.Assets;

public class HouseRoofBottomMiddle extends Tile{

	public HouseRoofBottomMiddle(int id) {
		super(Assets.houseRoofBottomMiddle, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
