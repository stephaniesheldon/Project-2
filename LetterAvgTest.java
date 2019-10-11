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
	public void letterAvgtest() throws IOException {
		LetterAvg letterAvgTest = new LetterAvg('C');
		int actual = letterAvgTest.numberOfStationWithLetterAvg();
		
		int expected = 11;
		Assert.assertEquals(expected, actual);
	}

	
	public void toStringTest(){
		LetterAvg letterAvgTest = new LetterAvg('C');
		String actual = letterAvgTest.toString();
		
		String expected = "\nThey are:\nCAMA\nCARL\nCENT\nCHAN\nCHER\nCHEY\nCHIC\nCLAY\nCLOU\nCOOK\nCOPA\n";
		
		Assert.assertEquals(expected,actual);
	}
}
