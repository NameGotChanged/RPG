package model.item;
	/**
	 * Provides Item properties to Shield and Sword Class
	 * @author NameG
	 *
	 */
public abstract class Item {
	int dmg;
	int def;
	int hp;
	/**
	 * ctor Item
	 * @param dmg : damage stat of the Item, gets added to the players dmg stats
	 * @param def : defense stat of the Item, gets added to the players def stats
	 * @param hp : health point stat of the Item, gets added to the players hp stats
	 */
	public Item(int dmg, int def, int hp) {
		this.dmg = dmg;
		this.def = def;
		this.hp = hp;
	}
	
}
