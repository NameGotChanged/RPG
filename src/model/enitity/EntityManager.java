package model.enitity;

import java.awt.Graphics;
import java.util.ArrayList;

import controller.Handler;
import model.enitity.creature.player.Player;

public class EntityManager {
	
	private Handler handler;
	private Player player;
	private ArrayList<Entity> entities;
	
	public EntityManager(Handler handler, Player player) {
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
	}
	
	public void tick() {
		for(int i = 0; i < entities.size(); i++) { //can't use Entity e : entities since it leads to errors
			Entity e = entities.get(i);
			e.tick();
		}
		player.tick();
	}
	
	public void render(Graphics g) {
		for(Entity e : entities) { //Creates an Entity called e for all Entities and puts it into the entities ArrayList
			e.render(g);
		}
		player.render(g);
	}
	
	public void addEntity(Entity e) {
		entities.add(e);
	}
	
	//GETTERS AND SETTERS

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
