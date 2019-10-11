import java.io.IOException;
import java.util.ArrayList;


public class PosAvg {

	private String stID;
	private ArrayList<String> allNames;
	private int trueIndex;
	
	public PosAvg(String stID) {
		this.stID = stID;
		
	}

	public String indexOfStation() throws IOException {
		ArrayList<MesoStation> allStations= MesoInherit.readFile("mesonet.txt");
		allNames = new ArrayList<String>();
		for (int i = 0; i < allStations.size(); i++){
			String name = allStations.get(i).getStID();
			allNames.add(name);
		}
		
		trueIndex = allNames.indexOf(stID);
		int userIndex  = trueIndex + 1;
	return Integer.toString(userIndex);
	}
	
	public String toString(){
		//This index is average of NOWA and OILT, NEWP and OKCE, and so on.
		//Stirng toReturn = "This index is average of"
	}
	
	public String getEquivalentAverage(int N){
		try{
			String upperName = allNames.get(trueIndex - N);
			String lowerName = allNames.get(trueIndex + N);
			return upperName + " and " + lowerName + ",";
		}
		catch(NullPointerException e){
			return null;
		}
		
	}
}
