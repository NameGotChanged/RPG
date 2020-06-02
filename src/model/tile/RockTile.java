package model.tile;

import java.awt.image.BufferedImage;

import model.character.Character_Player_Assets;

public class RockTile extends Tile{

	public RockTile(int id) {
		super(Character_Player_Assets.stone, id);
		
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}
