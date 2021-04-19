import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.Test;

public class TestProg6  {
@Test
	public void testWelcome() {
		String[] arrayWithDuplicates= {"horse", "dog", "cat", "horse","dog"};
		String[] result = Prog6.removeDups(arrayWithDuplicates);
		String[] expectedResult={"horse","dog","cat"};
		assertTrue(Arrays.equals(expectedResult,result));
	}
}
