package controller;

import java.awt.Graphics;

import java.awt.image.BufferStrategy;


import model.character.Character_Player;
import model.character.Character_Player_Assets;

import view.Display;


public class GameController implements Runnable {
	
	private Display display;
	public Character_Player nino;
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
	
	//States
	
	/**
	 * ctor
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
		Character_Player_Assets.init();
		nino = new Character_Player(50, 50, 50, 50, 50, 1);
		
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
		nino.display(g);
		
		
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
		
		int fps = 60;//ticks per second
		//1second in nano seconds / fps = 60 frames per second
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		// As long as running is true loop
		 
		while(running) {
			//Basically holds the Value of time before the code below
			now = System.nanoTime();
			//Delta is 1 or higher when the game needs to be updated and rendered
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			//Basically holds the Value of time after the code above
			lastTime = now;
			//Checking if delta is bigger or equal to 1
			if(delta >= 1) {
			tick();
			render();
			ticks++;
			delta--; //resetting Delta
			}
			//If the timer is equal to 1 sec in nano seconds
			//Print out how many times the game and the image have been updated in that second
			//FPS
			if(timer >= 1000000000) {
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
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
	
	/*public void keyPressed() {
		switch() {
		case(upKey):
			
		}
	
	}*/
	}
	
