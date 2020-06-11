package model.tile;

import view.Assets;

/**
 * the top left house tile which isn't a roof tile
 * 
 * @author NameG
 *
 */
public class HouseTopLeft extends Tile {

	public HouseTopLeft(int id) {
		super(Assets.houseTopLeft, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isSolid() {
		return true;
	}
}
