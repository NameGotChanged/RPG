package model.tile;

import view.Assets;

public class HouseBottomMiddle extends Tile{

	public HouseBottomMiddle(int id) {
		super(Assets.houseBottomMiddle, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
