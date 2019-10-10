import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class MesoInheritTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void calcAverageTest() {
		MesoStation testStation = new MesoStation("ABCD");
		MesoInherit testInherit = new MesoInherit(testStation);
		
		double average = 66.5;
		
		int[] expected = {67,66,66};
		int[] actual = new int[3];
		
		actual = testInherit.calAverage();
		
		Assert.assertEquals(expected[0],actual[0]);
		Assert.assertEquals(expected[1],actual[1]);
		Assert.assertEquals(expected[2],actual[2]);
		
	}

}
