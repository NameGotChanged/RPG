package model.tile;

import view.Assets;

public class HouseBottomRight extends Tile{

	public HouseBottomRight(int id) {
		super(Assets.houseBottomRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
