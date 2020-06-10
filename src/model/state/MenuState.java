package model.state;

import java.awt.Graphics;
import controller.Handler;
import model.ui.ClickListener;
import model.ui.UIImageButton;
import model.ui.UIManager;
import view.Assets;

public class MenuState extends State {
	
	private UIManager uiManager;
	
	public MenuState(Handler handler) {
		super(handler);
		
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(140.00f, 200.00f, 128, 64, Assets.user_Interface_Button, new ClickListener(){
			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null); //unset the UIManager so u can't restart the game while being in the game
				GameStateManager.setState(handler.getGame().gameState);
			}
			}));
	}

	@Override
	public void tick() {
		/*Test Code, checking if mouse position and mousePressed and released works
		System.out.println(handler.getMouseManager().getMouseX() + "   " + handler.getMouseManager().getMouseY());
		if(handler.getMouseManager().isLeftPressed() && handler.getMouseManager().isRightPressed())
			GameStateManager.setState(handler.getGame().gameState);
		*/
		uiManager.tick();
	}

	@Override
	public void render(Graphics g) {
		/*Test Code, draws rectangle at position of the cursor
		g.setColor(Color.RED);
		g.fillRect(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 8, 8);
		*/
		
		uiManager.render(g);
	}

}
