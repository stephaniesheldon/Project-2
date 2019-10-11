import java.io.IOException;
import java.util.ArrayList;


public class LetterAvg {

	private String letterAverage;
	private ArrayList<String> matchingNames;
	
	public LetterAvg(String letterAverage) {
		this.letterAverage = letterAverage;
	}

	public String numberOfStationWithLetterAvg() throws IOException {
		
		
			matchingNames = new ArrayList<String>();
		
			ArrayList<MesoStation> allNames = MesoInherit.readFile("Mesonet.txt");
			for(int i = 0; i<77; i++){
				String stationName = allNames.get(i).getStID();
				String firstLetter = stationName.substring(0,1);
				
				if(firstLetter.equals(letterAverage)){
					matchingNames.add(stationName);
				}	
			}
			
			int numOfSame = matchingNames.size();
			String toReturn = Integer.toString(numOfSame);
		return toReturn;	
	}
	
	
	public String toString(){
		String toReturn;
		toReturn = "\nThey are:\n";
		for(int i = 0; i < matchingNames.size(); i++){
			toReturn = toReturn + matchingNames.get(i) + "\n";
		}
		return toReturn;
	}
	
	
}
