package mypackage1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mypackage.Welcome2;

public class TestWelcome2  {
@Test
	public void testWelcome() {
		String result = Welcome2.welcome();
		assertEquals("Welcome", result);
	}
}
