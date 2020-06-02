package controller;

import java.awt.Graphics;

import java.awt.image.BufferStrategy;

import controller.camera.GameCamera;
import controller.keyManager.KeyManager;
import controller.state.GameState;
import controller.state.GameStateManager;
import controller.state.MenuState;
import controller.state.State;
import model.character.Character_Player;
import model.character.Character_Player_Assets;

import view.Display;


public class GameController implements Runnable {
	
	private Display display;
	public Character_Player nino;
	private int width, height;
	public String title;
	
	
	private boolean running = false;
	private Thread thread;
	
	//Tells computer to draw things to Buffer before it draws it to the screen
	//Reduces flickering by not drawing to the screen directly
	private BufferStrategy bs;
	//Graphics object
	private Graphics g;
	
	//States
	private State gameState;
	private State menuState;
	
	//Input
	private KeyManager keyManager;
	
	//Camera
	private GameCamera gameCamera;
	
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
		keyManager = new KeyManager();
	}
	/**
	 * Setup Game
	 */
	private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		//Loads in all the Images from a spriteSheet
		Character_Player_Assets.initPlayerSprites();
		Character_Player_Assets.initTextures();
		
		gameCamera = new GameCamera(0, 0);
		
		gameState = new GameState(this);
		menuState = new MenuState(this);
		GameStateManager.setState(gameState);
	}
	/**
	 * Updates modell
	 */
	private void tick() {
		keyManager.tick();
		
		if(GameStateManager.getState() != null) //Avoiding nullPointerEx
			GameStateManager.getState().tick(); //updating modell (ticking)
	}
	/**
	 * renders/draws the updated data to Display/buffer1
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
		
		if(GameStateManager.getState() != null) //Avoiding nullPointerEx
			GameStateManager.getState().render(g); //drawing
		
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
	
	public GameCamera getGameCamera() {
		return gameCamera;
	}
	
	public KeyManager getKeyManager() {
		return keyManager;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
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
	
