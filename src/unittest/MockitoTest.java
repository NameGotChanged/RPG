package unittest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import model.ui.ClickListener;

public class MockitoTest {

	@Test
	public void test() {
		ClickListener click = Mockito.mock(ClickListener.class);
	}

}
