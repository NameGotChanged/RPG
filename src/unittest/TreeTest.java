package unittest;

import static org.junit.Assert.*;

import org.junit.Test;

import model.enitity.staticEntity.Tree;

public class TreeTest {

	final static float x = 120;
	final static float y = 220;

	@Test
	public void testConstructor() {
		Tree treeno = new Tree(null, x, y);
		assertEquals(x, treeno.getX(), 0.00001);
		assertEquals(y, treeno.getY(), 0.00001);
	}

}
