package model.tile;

import view.Assets;

public class HouseTopRight extends Tile{

	public HouseTopRight(int id) {
		super(Assets.houseTopRight, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
