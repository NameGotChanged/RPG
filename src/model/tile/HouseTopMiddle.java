package model.tile;

import view.Assets;

public class HouseTopMiddle extends Tile{

	public HouseTopMiddle(int id) {
		super(Assets.houseTopMiddle, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
