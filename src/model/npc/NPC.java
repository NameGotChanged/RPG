package model.npc;

public abstract class NPC {
	int x;
	int y;
	/**
	 * @param x : x position of NPC
	 * @param y : y position of NPC
	 */
	public NPC(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * gives Quest to Player in form of text displays it afterwards in a menu
	 */
	public void giveQuest(){
	
	}
	/**
	 * If Quest has been completed reward user with Sword and Shield to kill the monster
	 */
	public void rewardQuest() {
		
	}
	
}
