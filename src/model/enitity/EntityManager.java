package model.enitity;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;

import controller.Handler;
import model.enitity.creature.player.Player;

/**
 * Manages, draws and ticks the entities
 * 
 * @author NameG
 *
 */
public class EntityManager {

	private Handler handler;
	private Player player;
	private ArrayList<Entity> entities;

	// Compares the height of the entities to decide which one gets drawn on top of
	// the other one
	private Comparator<Entity> renderSorter = new Comparator<Entity>() {

		@Override
		public int compare(Entity a, Entity b) {
			if (a.getY() + a.getHeight() < b.getY() + b.getHeight()) // Compares the bottom < cordinate of the Entities
				return -1;
			return 1;
		}

	};

	/**
	 * 
	 * @param handler : Handler object
	 * @param player  : Player object
	 */
	public EntityManager(Handler handler, Player player) {
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
		addEntity(player);
	}

	/**
	 * Update entity model
	 */
	public void tick() {
		for (int i = 0; i < entities.size(); i++) { // can't use Entity e : entities since it leads to errors
			Entity e = entities.get(i);
			e.tick();
			if (!e.isActive()) // If the eneties health is 0 or lower it should get removed
				entities.remove(e);
		}
		entities.sort(renderSorter);
	}

	/**
	 * render entities
	 * 
	 * @param g
	 */
	public void render(Graphics g) {
		for (Entity e : entities) { // Creates an Entity called e for all Entities and puts it into the entities
									// ArrayList
			e.render(g);
		}
	}

	/**
	 * Add entities to the arrayList
	 * 
	 * @param e
	 */
	public void addEntity(Entity e) {
		entities.add(e);
	}

	// GETTERS AND SETTERS

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

}
