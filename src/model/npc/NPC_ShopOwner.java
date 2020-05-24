package model.npc;

public class NPC_ShopOwner extends NPC {

	public NPC_ShopOwner(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Sells the Item to a Player Character
	 */
	public void giveItem() {
		//delete Item out of ArrayList and add it to the players ItemList
		//and deduct the amount of money it costs if the player has enough money
	}
	
	public void takeItem() {
		//delete Item out of players ItemList and add it to ArrayList
		//give back 90% of the item value to the player
	}
}
