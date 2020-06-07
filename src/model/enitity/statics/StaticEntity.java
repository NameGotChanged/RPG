package model.enitity.statics;

import controller.Handler;
import model.enitity.Entity;

/**
 * Entities that don't move
 * @author NameG
 *
 */
public abstract class StaticEntity extends Entity {
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}
}
