package model.tile;


import view.Assets;

public class WallTileX extends Tile{

	public WallTileX(int id) {
		super(Assets.wallTileX, id);
		
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
