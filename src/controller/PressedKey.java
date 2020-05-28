package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PressedKey implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case (KeyEvent.VK_W):
			System.out.println(e.getKeyCode());
		case (KeyEvent.VK_A):
		case (KeyEvent.VK_S):
		case (KeyEvent.VK_D):			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
