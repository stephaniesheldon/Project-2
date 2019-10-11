import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

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
		
		int[] expected = {67,66,67};
		int[] actual = new int[3];
		
		actual = testInherit.calAverage();
		
		Assert.assertEquals(expected[0],actual[0]);
		Assert.assertEquals(expected[1],actual[1]);
		Assert.assertEquals(expected[2],actual[2]);
		
	}
	
	
	@Test
	public void readFileTest(){
		try{
			MesoStation testStation = new MesoStation("ABCD");
			MesoInherit testInherit = new MesoInherit(testStation);
			
			String expected = "ALTU";
			ArrayList<MesoStation> stationArray= testInherit.readFile("Mesonet.txt");
			String actual = stationArray.get(2).getStID();
			System.out.println(actual);

			Assert.assertEquals(expected, actual);
			
		}
		catch(IOException e){
			fail("couldnt read file");
		}
		
		
		
	}
	
	public void LetterAvgTest(){
		
		MesoStation testStation = new MesoStation("AAZZ");
		MesoInherit testInherit = new MesoInherit(testStation);
		
		String actual = testInherit.letterAverage();
		
		String expected = "N";
		
		Assert.assertEquals(expected, actual);
		
	}
}
