package model.ui;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import controller.Handler;

/**
 * Manages User Interface Elements (classes)
 * 
 * @author NameG
 *
 */
public class UIManager {

	private Handler handler;
	private ArrayList<UIObject> objects;
	private UIBackground uiBackground;

	public UIManager(Handler handler) {
		this.handler = handler;
		objects = new ArrayList<UIObject>();
		uiBackground = new UIBackground(0, 0, 400, 400);
	}

	public void tick() {
		for (UIObject o : objects)
			o.tick();
	}

	public void render(Graphics g) {
		uiBackground.render(g);
		for (UIObject o : objects)
			o.render(g);
	}

	public void onMouseMove(MouseEvent e) {
		for (UIObject o : objects)
			o.onMouseMove(e);
	}

	public void onMouseRelease(MouseEvent e) {
		for (UIObject o : objects)
			o.onMouseRelease(e);
	}

	public void addObject(UIObject o) {
		objects.add(o);
	}

	public void removeObject(UIObject o) {
		objects.remove(o);
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public ArrayList<UIObject> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<UIObject> objects) {
		this.objects = objects;
	}

}
