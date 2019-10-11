import static org.junit.Assert.*;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class PosAvgTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void indexOfStationTest() {
		String station = "ADAX";
		String expected = "2";
		
		PosAvg posTest = new PosAvg(station);
		String actual;
		try {
			actual = posTest.indexOfStation();
			Assert.assertEquals(expected, actual);
		} catch (IOException e) {
			fail("exception");
		}
		
		
	}

}
