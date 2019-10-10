import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MesoInherit extends MesoAbstract {
	
	private int [] averages;
	private static final int AVERAGE_ARRAY_SIZE = 3;

	
	
	public MesoInherit(MesoStation mesoStation) {
		this.station = mesoStation;
	}
	

	
	
	public ArrayList<MesoStation> readFile(String fileName) throws IOException{
		
		ArrayList<MesoStation> stations = new ArrayList <MesoStation>();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
    	String stationName = br.readLine();
    	for(int i = 0; i < 2; ++i){
    		stationName = br.readLine();
    	}
    	stationName = br.readLine();
    	
    	//parses string by eliminating front whitespaces and finding the next space
    	while(stationName != null){

    		stationName = stationName.substring(1,5);
    		MesoStation tempStation = new MesoStation(stationName);
    		stations.add(tempStation);

    		stationName = br.readLine();
    	}
    	br.close();
    	
    	return stations;
	}

	
	
	
	/**
	 * Find the average int of the four character station 
	 * 
	 * @return int array 
	 */
	public int[] calAverage() {
		String id = station.getStID();
		int total = 0;
		averages = new int [AVERAGE_ARRAY_SIZE];
		for(int i=0; i<4; i++){
			char letter = id.charAt(i);
			int asciiVal = letter;
			
			total += asciiVal;
		}
		
		double rawAvg = total / 4.0;
		
		averages[0] = (int) Math.ceil(rawAvg);
		averages[1] = (int) Math.floor(rawAvg);
		if((rawAvg % 1) < 0.5){
			averages[2] = (int) rawAvg;
		}
		else{
			averages[2] = averages[0];
		}
		
		
		
		return averages;
	}

	public String letterAverage() {
		
		
		return null;
	}

}
