
public class MesoInherit extends MesoAbstract {
	

	private static final int AVERAGE_ARRAY_SIZE = 3;

	public MesoInherit(MesoStation mesoStation) {
		this.station = mesoStation;
	}

	/**
	 * Find the average int of the four character station 
	 * 
	 * @return int array 
	 */
	public int[] calAverage() {
		String id = station.getStID();
		int total = 0;
		int [] averages = new int [AVERAGE_ARRAY_SIZE];
		for(int i=0; i<4; i++){
			char letter = id.charAt(i);
			int asciiVal = letter;
			
			total += asciiVal;
		}
		
		double rawAvg = total / 4.0;
		
		averages[0] = (int) Math.ceil(rawAvg);
		averages[1] = (int) Math.floor(rawAvg);
		averages[2] = (int) rawAvg;
		
		
		return averages;
	}

	public String letterAverage() {
		// TODO Auto-generated method stub
		return null;
	}

}
