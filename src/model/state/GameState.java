package model.state;

import java.awt.Graphics;

import model.character.Character_Player_Assets;


public class GameState extends State{
	
	public GameState() {
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Character_Player_Assets.characterMovingToTheLeft,0,0,null);
	}

}
