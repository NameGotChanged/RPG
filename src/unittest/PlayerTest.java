package unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import model.enitity.creature.player.Player;

public class PlayerTest {
	final static float x = 50;
	final static float y = 20;

	@Test
	public void testConstructor() {
		Player nino = new Player(null, x, y);
		assertEquals(x, nino.getX(), 0.0001);
		assertEquals(y, nino.getY(), 0.0001);
	}

}
