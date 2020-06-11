package unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import model.enitity.creature.slime.Slime;

public class SlimeTest {
	final static float x = 3240;
	final static float y = 230;

	@Test
	public void testConstructor() {
		Slime slimeyBoy = new Slime(null, x, y);
		assertEquals(x, slimeyBoy.getX(), 0.00001);
		assertEquals(y, slimeyBoy.getY(), 0.00001);
	}

}
