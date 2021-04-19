import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Prog2_8Test {	
	@Test
	public void testWelcome() {

		int[] arrOfInts= {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int expectedOutput=-22;
		int result = Prog2_8.min(arrOfInts);
		assertEquals(expectedOutput, result);
	}

}
