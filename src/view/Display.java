package view;

//awt basis of Swing framework
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	
	private JFrame frame;
	private Canvas canvas;
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	private void createDisplay() {
		//Makes a new JFrame Object (a Window) and sets the title.
		frame = new JFrame(title);
		//Sets the Size of the Window
		frame.setSize(width, height);
		//Important because you don't want the window be closed but the game still running in the background!
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Can't change windows size
		frame.setResizable(false);
		//Null sets the Window location in the middle of the screen
		frame.setLocationRelativeTo(null);
		//Displays the window (makes it visible)
		frame.setVisible(true);
		
		
		/*
		 * Might split the Canvas from the Window later
		 */
		//Makes a new Canvas to draw on
		canvas = new Canvas();
		//sets the preferred Size of the canvas
		canvas.setPreferredSize(new Dimension(width, height));
		//sets the maximum Size of the canvas
		canvas.setMaximumSize(new Dimension(width, height));
		//sets the minimum Size of the canvas
		canvas.setMinimumSize(new Dimension(width, height));
		//Makes it that the JFrame is the only Focusable window (so it doesn't focus the canvas)
		canvas.setFocusable(false);
		//adds the canvas to the JFrame Object named frame
		frame.add(canvas);
		//Resizes the frame to match the canvas Size
		frame.pack();
		}
	/**
	 * get Canvas
	 * @return : Canvas
	 */
	public Canvas getCanvas() {
		return canvas;
	}
	
	public JFrame getFrame() {
		return frame;
	}
}
