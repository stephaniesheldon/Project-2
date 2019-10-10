import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class LetterAvgTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws IOException {
		LetterAvg letterAvgTest = new LetterAvg("C");
		String actual = letterAvgTest.numberOfStationWithLetterAvg();
		
		String expected = "11";
		Assert.assertEquals(expected, actual);
	}

}
