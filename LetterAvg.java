import java.io.IOException;
import java.util.ArrayList;


public class LetterAvg {

	private char letterAverage;
	private ArrayList<String> matchingNames;
	
	public LetterAvg(char letterAverage) {
		this.letterAverage = letterAverage;
	}

	public int numberOfStationWithLetterAvg() throws IOException {
		
		
			matchingNames = new ArrayList<String>();
		
			ArrayList<MesoStation> allNames = MesoInherit.readFile("Mesonet.txt");
			for(int i = 0; i<77; i++){
				String stationName = allNames.get(i).getStID();
				char firstLetter = stationName.charAt(0);
				
				if(firstLetter == letterAverage){
					matchingNames.add(stationName);
				}	
			}
			
			int numOfSame = matchingNames.size();
		return numOfSame;	
	}
	
	
	public String toString(){
		try{
		this.numberOfStationWithLetterAvg();
		String toReturn;
		toReturn = "\nThey are:";
		for(int i = 0; i < matchingNames.size(); i++){
			toReturn = toReturn +"\n" + matchingNames.get(i);
		}
		return toReturn;
		}
		catch(IOException e){
			return null;
		}
	}
	
	
}
