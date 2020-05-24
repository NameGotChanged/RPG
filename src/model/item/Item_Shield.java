package model.item;
	/**
	 * Provides shield properties
	 * @author NameG
	 *
	 */
public class Item_Shield extends Item{
	/**
	 * Is an Item type specializing in defense 
	 * @param def : defense stat of the shield gets added to player def stats
	 * @param hp : health point stat gets added to player hp stats, shields usually have 0 hp
	 * @param dmg : damage stat gets added to player dmg stats, shields usually have 0 dmg
	 */
	public Item_Shield(int def, int hp, int dmg) {
		super(dmg, def, hp);
		// TODO Auto-generated constructor stub
	}
	
}
