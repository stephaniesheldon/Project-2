import java.io.IOException;
import java.util.ArrayList;


public class PosAvg {

	private String stID;
	private ArrayList<String> allNames;
	private int trueIndex;
	
	public PosAvg(String stID) {
		this.stID = stID;
		
	}

	public int indexOfStation() throws IOException {
		ArrayList<MesoStation> allStations= MesoInherit.readFile("Mesonet.txt");
		allNames = new ArrayList<String>();
		for (int i = 0; i < allStations.size(); i++){
			String name = allStations.get(i).getStID();
			allNames.add(name);
		}
		
		trueIndex = allNames.indexOf(stID);
		int userIndex  = trueIndex + 1;
	return userIndex;
	}
	
	public String toString(){
		//This index is average of NOWA and OILT, NEWP and OKCE, and so on.
		String toReturn = "This index is average of "
				+ this.getEquivalentAverage(1) + this.getEquivalentAverage(2)
				+ "and so on.";
		return toReturn;
	}
	
	public String getEquivalentAverage(int N){

			String upperName = allNames.get(trueIndex - N);
			String lowerName = allNames.get(trueIndex + N);
			return upperName + " and " + lowerName + ", ";
		
		
	}
}
