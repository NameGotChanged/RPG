package model.tile;

import view.Assets;

public class WallCornerTopLeft extends Tile {

	public WallCornerTopLeft (int id) {
		super(Assets.wallCornerTopLeft, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
