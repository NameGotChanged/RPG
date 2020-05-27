package controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import view.Assets;
import view.Display;
import view.ImageLoader;
import view.SpriteSheet;

public class GameController implements Runnable {
	
	private Display display;
	public int width;
	public int height;
	public String title;
	
	
	private boolean running = false;
	private Thread thread;
	
	//Tells computer to draw things to Buffer before it draws it to the screen
	//Reduces flickering by not drawing to the screen directly
	private BufferStrategy bs;
	//Graphics object
	private Graphics g;
	
	/**
	 * 
	 * @param title : Display Window Title
	 * @param width : Display Window width
	 * @param height : Display Window height
	 */
	public GameController(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
	}
	/**
	 * Setup Game
	 */
	private void init() {
		display = new Display(title, width, height);
		//Loads in all the Images from a spriteSheet
		Assets.init();
	}
	/**
	 * Updates modell
	 */
	private void tick() {
		
	}
	/**
	 * draws the updated data to Display
	 */
	public void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		//Start Drawing!
		
		g.drawImage(Assets.playerIdle1, 0,0 , null);
		g.drawImage(Assets.playerIdle2, 32,0 , null);
		
		
		//End Drawing!
		//displays the things drawn to the bs object
		bs.show();
		//stops drawing
		g.dispose();
	}
	
	/**
	 * Initializes the game and runs the game loop
	 */
	@Override
	public void run() {
		//Sets up the Game
		init();
		// As long as running is true loop
		 
		while(running) {
			tick();
			render();
		}
		//stops the thread if it isn't already stopped
		stop();
	}
	
	/**
	 * Starts Thread
	 */
	public synchronized void start() {
		//In the case that the start method gets called while it is already running
		//It should return (go out of the start method)
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		//runs run method
		thread.start();
	}
	/**
	 * Stops Thread
	 */
	public synchronized void stop() {
		//if not running return
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
