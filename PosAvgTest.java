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
		int expected = 2;
		
		PosAvg posTest = new PosAvg(station);
		int actual;
		try {
			actual = posTest.indexOfStation();
			Assert.assertEquals(expected, actual);
		} catch (IOException e) {
			fail("exception");
		}
	}
	
	@Test
	public void getEquivalentAverageTest(){
		
		String station = "BRIS";
		PosAvg posTest = new PosAvg(station);
		
		String expected = "BOIS and BUFF, ";
		String actual = posTest.getEquivalentAverage(2);
		System.out.println(posTest.getEquivalentAverage(2));
		
		Assert.assertEquals(expected, actual);
	}
	
}
