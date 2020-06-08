package model.tile;

import view.Assets;

public class WallCornerTopRight extends Tile{

	public WallCornerTopRight(int id) {
		super(Assets.wallCornerTopRight, id);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
}
