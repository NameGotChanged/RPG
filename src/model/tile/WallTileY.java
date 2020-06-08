package model.tile;


import view.Assets;

public class WallTileY extends Tile{

	public WallTileY(int id) {
		super(Assets.wallTileY, id);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
	
}
