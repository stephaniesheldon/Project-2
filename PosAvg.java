import java.io.IOException;
import java.util.ArrayList;


public class PosAvg {

	private String stID;
	
	public PosAvg(String stID) {
		this.stID = stID;
		
	}

	public String indexOfStation() throws IOException {
		ArrayList<MesoStation> allStations= MesoInherit.readFile("mesonet.txt");
		ArrayList<String> allNames = new ArrayList<String>();
		for (int i = 0; i < allStations.size(); i++){
			String name = allStations.get(i).getStID();
			allNames.add(name);
		}
		
		int trueIndex = allNames.indexOf(stID);
		int userIndex  = trueIndex + 1;
	return Integer.toString(userIndex);
	}
	
}
