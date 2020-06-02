package controller.keyManager;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{

	
	private boolean [] keys;
	public boolean up, down, left, right;
	
	public KeyManager(){
		keys = new boolean[256];
		
	}
	
	public void tick() {
		up = keys[KeyEvent.VK_W];
		left = keys[KeyEvent.VK_A];
		down = keys[KeyEvent.VK_S];
		right = keys[KeyEvent.VK_D];
	}
	
	/*
	 * Is called whenever a user presses a key
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;	//Gets the keyCode of the key that got pressed and sets it to true = being pressed
		System.out.println("Pressed!");
	}
	/*
	 * Is called whenever a key is released (not pressed)
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;	//Gets the keyCode of the key that got pressed and sets it to false = not being pressed
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
}
