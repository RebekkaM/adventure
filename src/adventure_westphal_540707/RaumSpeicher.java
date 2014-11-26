package adventure_westphal_540707;

import java.util.LinkedList;

public class RaumSpeicher {
	
	private static LinkedList<Raum> speicher = new LinkedList<Raum>();
	
	public RaumSpeicher() {
		// TODO Auto-generated constructor stub
	}

	public static LinkedList<Raum> getAlleRaume() {
		return speicher;
	}
	
	public static void save(Raum speicher) {
		RaumSpeicher.speicher.add(speicher.getNr(), speicher);
	}
	
	public static void clear(){
		RaumSpeicher.speicher.clear();
	}

}
